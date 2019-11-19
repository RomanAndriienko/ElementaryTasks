package com.soft.homework.validator.inputValidator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

public class NumberValidator implements InputValidator {
    private static final Logger logger = LoggerFactory.getLogger(NumberValidator.class);

    @Override
    public boolean validate(BigInteger number) {
        boolean valid = true;

        if (number.compareTo(BigInteger.ZERO) < 0) {
            valid = false;
            logger.info("Fibonacci numbers can't be negative");
        }
        return valid;
    }
}
