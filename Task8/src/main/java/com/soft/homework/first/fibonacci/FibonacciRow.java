package com.soft.homework.first.fibonacci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public abstract class FibonacciRow {
    private static final Logger logger = LoggerFactory.getLogger(FibonacciRow.class);

    public abstract List<BigInteger> getRow (BigInteger ... args);

    public static void showInfo() {
        logger.info("\n The program allows you to display all Fibonacci " +
                "\n numbers that are in the specified range or have the specified length. " +
                "\n Entering one argument, we get a row of fibonacci, " +
                "\n in which all the numbers of the specified length." +
                "\n Entering two arguments, we get all the fibonacci numbers" +
                "\n that are in the specified range");
    }

    public void printFibonacciRow(List<BigInteger> row) {
        System.out.println(Arrays.toString(row.toArray()));
    }

    BigInteger sumOfTwoNumbers(BigInteger a, BigInteger b) {
        return a.add(b);
    }
}
