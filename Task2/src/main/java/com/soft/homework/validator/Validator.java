package com.soft.homework.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Validator {
    private static final Logger logger = LoggerFactory.getLogger(Validator.class);

    public boolean isArgsValid(double width, double height) {
        boolean valid = true;

        if (!validateSide(width) || !validateSide(height)) {
            valid = false;
            logger.info("The side of the envelope cannot be negative");
        }

        return valid;
    }

    private boolean validateSide(double side) {
        return side > 0 && side < Integer.MAX_VALUE;
    }
}
