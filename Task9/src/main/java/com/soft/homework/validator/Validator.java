package com.soft.homework.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Validator {
    private static final Logger logger = LoggerFactory.getLogger(Validator.class);

    public boolean validateArgs(int num, int pow) {
        boolean valid = true;

        if (!validateNum(num)) {
            valid = false;
        }

        if (!validatePow(pow)) {
            valid = false;
        }

        return valid;
    }

    private boolean validateNum(int num) {
        boolean valid = true;

        if (num < 1 || num > Integer.MAX_VALUE - 1) {
            valid = false;
            logger.info("The number should not be negative or bigger 2^31 - 1");
        }

        return valid;
    }

    private boolean validatePow(int pow) {
        boolean valid = true;

        if (pow < 1 || pow > Integer.MAX_VALUE - 1) {
            valid = false;
            logger.info("The degree should not be negative or bigger 2^31 - 1");
        }

        return valid;
    }
}
