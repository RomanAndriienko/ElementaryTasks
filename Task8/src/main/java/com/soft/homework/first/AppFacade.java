package com.soft.homework.first;

import com.soft.homework.first.fibonacci.FibonacciLength;
import com.soft.homework.first.fibonacci.FibonacciRange;
import com.soft.homework.first.fibonacci.FibonacciRow;
import com.soft.homework.first.validator.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.List;

class AppFacade {
    private static final Logger logger = LoggerFactory.getLogger(AppFacade.class);

    void startApp(String[] args) {
        if (args.length == 0 || args.length > 2) {
            FibonacciRow.showInfo();
        }

        try {
            if (args.length == 1) {
                BigInteger lengthNumber = new BigInteger(args[0]);
                Validator validator = new Validator();

                if (validator.validateNumberLength(lengthNumber)) {
                    FibonacciRow fibonacci = new FibonacciLength();
                    List<BigInteger> row = fibonacci.getRow(lengthNumber);
                    fibonacci.printFibonacciRow(row);
                } else {
                    logger.info("Good luck next time !");
                }
            }

            if (args.length == 2) {
                BigInteger start = new BigInteger(args[0]);
                BigInteger end = new BigInteger(args[1]);
                Validator validator = new Validator();

                if (validator.validateRange(start, end)) {
                    FibonacciRow fibonacci = new FibonacciRange();
                    List<BigInteger> row = fibonacci.getRow(start, end);
                    fibonacci.printFibonacciRow(row);
                } else {
                    logger.info("Good luck next time");
                }
            }
        } catch (NumberFormatException e) {
            logger.info("Sorry, you can use only integers");
        }

    }
}
