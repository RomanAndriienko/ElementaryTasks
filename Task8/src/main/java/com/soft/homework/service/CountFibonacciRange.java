package com.soft.homework.service;

import com.soft.homework.model.FibonacciRow;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CountFibonacciRange extends FibonacciRow {

    @Override
    public List<BigInteger> getRow(BigInteger... args) {
        BigInteger start = args[0];
        BigInteger end = args[1];

        List<BigInteger> row = new ArrayList<>();
        row.add(BigInteger.ZERO);
        row.add(BigInteger.ONE);

        if (end.compareTo(BigInteger.valueOf(1)) == 0) {
            row.add(BigInteger.ONE);
            return row;
        }

        List<BigInteger> result = new ArrayList<>();

        findFirstTwoNumbers(start, row, result);

        BigInteger currNumber = BigInteger.ZERO;

        for (int i = 2; currNumber.compareTo(end) <= 0; i++) {
            currNumber = sumOfTwoNumbers(result.get(i - 1), result.get(i - 2));
            if (currNumber.compareTo(end) <= 0) {
                result.add(currNumber);
            }
        }

        return result;
    }

    @Override
    public List<BigInteger> getRowRecursively(BigInteger... args) {
        return null;
    }

    private void findFirstTwoNumbers(BigInteger start, List<BigInteger> row, List<BigInteger> result) {
        if (start.compareTo(BigInteger.ZERO) == 0) {
            result.add(BigInteger.ZERO);
            result.add(BigInteger.ONE);
            return;
        }

        BigInteger currNumber;

        for (int i = 2; ; i++) {
            row.add(sumOfTwoNumbers(row.get(i - 1), row.get(i - 2)));
            currNumber = row.get(i);
            if (currNumber.compareTo(start) >= 0) {
                result.add(row.get(i));
                result.add(sumOfTwoNumbers(row.get(i), row.get(i - 1)));
                break;
            }
        }
    }
}
