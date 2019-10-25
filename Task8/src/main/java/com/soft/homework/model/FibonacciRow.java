package com.soft.homework.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.List;

//What is a fibonacci model ?

public abstract class FibonacciRow {
    private static final Logger logger = LoggerFactory.getLogger(FibonacciRow.class);

    public abstract List<BigInteger> getRow(BigInteger... args);

    public abstract List<BigInteger> getRowRecursively(BigInteger... args);

    public static void showInfo() {
        logger.info("\n The program allows you to display all Fibonacci " +
                "\n numbers that are in the specified range or have the specified length. " +
                "\n Entering one argument, we get a row of model, " +
                "\n in which all the numbers of the specified length." +
                "\n Entering two arguments, we get all the model numbers" +
                "\n that are in the specified range");
    }

    public static void printFibonacciRow(List<BigInteger> row) {
        logger.info(String.valueOf(row));
    }

    protected BigInteger sumOfTwoNumbers(BigInteger a, BigInteger b) {
        return a.add(b);
    }
}
