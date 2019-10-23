package com.soft.homework.first.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciRange extends FibonacciRow {
    @Override
    public List<BigInteger> getRow(BigInteger... args) {
        BigInteger start = args[0];
        BigInteger end = args[1];

//        if (start.compareTo(BigInteger.ZERO) < 0 || end.compareTo(BigInteger.ZERO) < 0) {
//            logger.info("Fibonacci numbers can't be negative");
//            throw new IllegalArgumentException("Fibonacci numbers can't be negative");
//        }
//
//        if (start.compareTo(end) >= 0) {
//            logger.info("End should be bigger than start");
//            throw new IllegalArgumentException("End should be bigger than start");
//        }

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
