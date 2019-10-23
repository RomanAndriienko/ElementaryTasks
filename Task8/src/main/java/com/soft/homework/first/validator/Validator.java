package com.soft.homework.first.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

public class Validator {
    private static final Logger logger = LoggerFactory.getLogger(Validator.class);

    public boolean validateNumberLength (BigInteger lengthNumber) {
        boolean valid = true;

        if (lengthNumber.compareTo(BigInteger.ZERO) <= 0) {
            valid = false;
            logger.info("Fibonacci numbers can't be negative");
        }
        return valid;
    }

    public boolean validateRange (BigInteger start, BigInteger end) {
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
