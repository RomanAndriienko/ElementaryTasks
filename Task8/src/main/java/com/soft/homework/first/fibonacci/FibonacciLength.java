package com.soft.homework.first.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciLength extends FibonacciRow {
    @Override
    public List<BigInteger> getRow(BigInteger... args) {
        BigInteger lengthNumber = args[0];

//        if (lengthNumber.compareTo(BigInteger.ZERO) <= 0) {
//        logger.info("Fibonacci numbers can't be negative");
//            throw new IllegalArgumentException("Fibonacci numbers can't be negative");
//        }

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
}
