package com.soft.homework.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Validator implements IValidator {
    private static final Logger logger = LoggerFactory.getLogger(Validator.class);

    public boolean validateNumber (int num) {
        boolean valid = true;

        if (num < 1 || num > Integer.MAX_VALUE -1){
            valid = false;
            logger.info("The number should not be negative or bigger 2^31 - 1");
        }

        return valid;
    }
}
