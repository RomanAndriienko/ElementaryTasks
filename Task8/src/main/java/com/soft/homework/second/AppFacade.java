package com.soft.homework.second;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.List;

class AppFacade {
    private static final Logger logger = LoggerFactory.getLogger(AppFacade.class);

    static void startApp(String [] args) {
        if (args.length == 0 || args.length > 2) {
            FibonacciRow.showInfo();
        }

        try {
            if (args.length == 1) {
                BigInteger lengthNumber = new BigInteger(args[0]);
                List<BigInteger> row = FibonacciRow.getRow(lengthNumber);
                FibonacciRow.printFibonacciRow(row);
            }

            if (args.length == 2) {
                BigInteger start = new BigInteger(args[0]);
                BigInteger end = new BigInteger(args[1]);
                List<BigInteger> row = FibonacciRow.getRow(start, end);
                FibonacciRow.printFibonacciRow(row);
            }
        } catch (NumberFormatException e) {
            logger.info("Sorry, you can use only integers");
        }
    }
}
