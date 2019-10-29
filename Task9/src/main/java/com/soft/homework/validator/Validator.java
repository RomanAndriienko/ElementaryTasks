package com.soft.homework.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Validator {
    private static final Logger logger = LoggerFactory.getLogger(Validator.class);

    public boolean validateArgs(int num, int pow) {
        boolean valid = true;

        if (!validateArg(num)) {
            valid = false;
            logger.info("The number should not be negative or bigger 2^31 - 1");
        }

        if (!validateArg(pow)) {
            valid = false;
            logger.info("The degree should not be negative or bigger 2^31 - 1");
        }

        return valid;
    }

    private boolean validateArg(int arg) {
        return arg >= 1 && arg <= Integer.MAX_VALUE - 1;
    }
}
