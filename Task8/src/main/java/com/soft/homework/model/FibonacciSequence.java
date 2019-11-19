package com.soft.homework.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence extends Sequence {
    private static final Logger logger = LoggerFactory.getLogger(FibonacciSequence.class);

    @Override
    public List<BigInteger> getSequenceInRange(BigInteger min, BigInteger max) {
        List<BigInteger> row = new ArrayList<>();
        row.add(BigInteger.ZERO);
        row.add(BigInteger.ONE);

        if (max.compareTo(BigInteger.valueOf(1)) == 0) {
            row.add(BigInteger.ONE);
            setSequence(row);
            return getSequence();
        }

        List<BigInteger> result = new ArrayList<>();

        findFirstTwoNumbers(min, row, result);

        BigInteger currNumber = BigInteger.ZERO;

        for (int i = 2; currNumber.compareTo(max) <= 0; i++) {
            currNumber = sumOfTwoNumbers(result.get(i - 1), result.get(i - 2));
            if (currNumber.compareTo(max) <= 0) {
                result.add(currNumber);
            }
        }

        setSequence(result);
        return getSequence();
    }

    @Override
    public List<BigInteger> getSequenceByLengthNumber(BigInteger lengthNumber) {
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

        setSequence(result);
        return getSequence();
    }

    @Override
    public void showInfo() {
        logger.info("The program allows you to display all Fibonacci " +
                "\nnumbers that are in the specified range or have the specified length. " +
                "\nEntering one argument, we get a row of model, " +
                "\nin which all the numbers of the specified length." +
                "\nEntering two arguments, we get all the model numbers" +
                "\nthat are in the specified range");
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

    private BigInteger sumOfTwoNumbers(BigInteger a, BigInteger b) {
        return a.add(b);
    }
}
