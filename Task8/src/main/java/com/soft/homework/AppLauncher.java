package com.soft.homework;

import com.soft.homework.service.CountFibonacciNumberLength;
import com.soft.homework.service.CountFibonacciRange;
import com.soft.homework.model.FibonacciRow;
import com.soft.homework.validator.Validator;
import com.soft.homework.validator.NumberLengthValidator;
import com.soft.homework.validator.RangeValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.List;

class AppLauncher {
    private static final Logger logger = LoggerFactory.getLogger(AppLauncher.class);

    private AppLauncher() {}

    static void start (String[] args) {
        if (args.length == 0 || args.length > 2) {
            FibonacciRow.showInfo();
        }

        try {
            if (args.length == 1) {
                getRowByLengthNumber(args[0]);
            }

            if (args.length == 2) {
                getRowByRange(args);
            }

        } catch (NumberFormatException e) {
            logger.info("Sorry, you can use only integers");
        }

    }

    private static void getRowByRange(String[] args) {
        BigInteger start = new BigInteger(args[0]);
        BigInteger end = new BigInteger(args[1]);
        Validator validator = new RangeValidator();

        if (validator.validate(start, end)) {
            FibonacciRow fibonacci = new CountFibonacciRange();
            List<BigInteger> row = fibonacci.getRow(start, end);
            FibonacciRow.printFibonacciRow(row);
        }
    }

    private static void getRowByLengthNumber(String arg) {
        BigInteger lengthNumber = new BigInteger(arg);
        Validator validator = new NumberLengthValidator();

        if (validator.validate(lengthNumber)) {
            FibonacciRow fibonacci = new CountFibonacciNumberLength();
            List<BigInteger> row = fibonacci.getRow(lengthNumber);
            FibonacciRow.printFibonacciRow(row);
        }
    }
}
