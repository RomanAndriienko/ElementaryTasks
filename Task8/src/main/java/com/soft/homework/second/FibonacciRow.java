package com.soft.homework.second;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciRow {
    private static final Logger logger = LoggerFactory.getLogger(FibonacciRow.class);

    public static List<BigInteger> getRow(BigInteger lengthNumber) {

        if (lengthNumber.compareTo(BigInteger.ZERO) <= 0) {
        logger.info("Fibonacci numbers can't be negative");
            throw new IllegalArgumentException("Fibonacci numbers can't be negative");
        }

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

    public static List<BigInteger> getRow(BigInteger start, BigInteger end) {

        if (start.compareTo(BigInteger.ZERO) < 0 || end.compareTo(BigInteger.ZERO) < 0) {
            logger.info("Fibonacci numbers can't be negative");
            throw new IllegalArgumentException("Fibonacci numbers can't be negative");
        }

        if (start.compareTo(end) >= 0) {
            logger.info("End should be bigger than start");
            throw new IllegalArgumentException("End should be bigger than start");
        }

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

    private static void findFirstTwoNumbers(BigInteger start, List<BigInteger> row, List<BigInteger> result) {
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


    public static void showInfo() {
        logger.info("\n The program allows you to display all Fibonacci " +
                "\n numbers that are in the specified range or have the specified length. " +
                "\n Entering one argument, we get a row of fibonacci, " +
                "\n in which all the numbers of the specified length." +
                "\n Entering two arguments, we get all the fibonacci numbers" +
                "\n that are in the specified range");
    }

    public static void printFibonacciRow(List<BigInteger> row) {
        System.out.println(Arrays.toString(row.toArray()));
    }

    private static BigInteger sumOfTwoNumbers(BigInteger a, BigInteger b) {
        return a.add(b);
    }
}
