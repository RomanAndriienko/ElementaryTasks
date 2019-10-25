package com.soft.homework.service;

import com.soft.homework.model.FibonacciRow;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CountFibonacciNumberLength extends FibonacciRow {

    @Override
    public List<BigInteger> getRow(BigInteger... args) {
        BigInteger lengthNumber = args[0];

        List<BigInteger> row = new ArrayList<>();
        row.add(BigInteger.ZERO);
        row.add(BigInteger.ONE);

        List<BigInteger> result = new ArrayList<>();

        if (lengthNumber.compareTo(BigInteger.ONE) == 0) {
            result.add(BigInteger.ZERO);
            result.add(BigInteger.ONE);
        }

        BigInteger currNumber;
        int currLength = 0;

        for (int i = 2; lengthNumber.compareTo(BigInteger.valueOf(currLength)) >= 0; i++) {
            row.add(sumOfTwoNumbers(row.get(i - 1), row.get(i - 2)));
            currNumber = row.get(i);
            currLength = currNumber.toString().length();
            if (lengthNumber.compareTo(BigInteger.valueOf(currLength)) == 0) {
                result.add(row.get(i));
            }
        }

        return result;
    }

    @Override
    public List<BigInteger> getRowRecursively(BigInteger... args) {
        return null;
    }
}
