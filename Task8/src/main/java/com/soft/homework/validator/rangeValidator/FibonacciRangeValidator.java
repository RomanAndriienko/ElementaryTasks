package com.soft.homework.validator.rangeValidator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

public class FibonacciRangeValidator implements RangeValidator {
    private static final Logger logger = LoggerFactory.getLogger(FibonacciRangeValidator.class);

    @Override
    public boolean validate(BigInteger min, BigInteger max) {
        boolean valid = true;

        if (min.compareTo(max) >= 0) {
            valid = false;
            logger.info("End should be bigger than start");
        }
        return valid;
    }
}
