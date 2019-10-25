package com.soft.homework.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

public class NumberLengthValidator implements Validator {
    private static final Logger logger = LoggerFactory.getLogger(NumberLengthValidator.class);

    @Override
    public boolean validate(BigInteger... args) {
        BigInteger lengthNumber = args[0];

        boolean valid = true;

        if (lengthNumber.compareTo(BigInteger.ZERO) <= 0) {
            valid = false;
            logger.info("Fibonacci numbers can't be negative");
        }
        return valid;
    }
}
