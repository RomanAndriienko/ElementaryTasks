package com.soft.homework.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

public class RangeValidator implements Validator {
    private static final Logger logger = LoggerFactory.getLogger(RangeValidator.class);

    @Override
    public boolean validate(BigInteger... args) {
        BigInteger start = args[0];
        BigInteger end = args[1];

        boolean valid = true;

        if (start.compareTo(BigInteger.ZERO) < 0 || end.compareTo(BigInteger.ZERO) < 0) {
            valid = false;
            logger.info("Fibonacci numbers can't be negative");
        }

        if (start.compareTo(end) >= 0) {
            valid = false;
            logger.info("End should be bigger than start");
        }
        return valid;
    }
}
