package com.soft.homework.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Validator {
    private static final Logger logger = LoggerFactory.getLogger(Validator.class);

    public boolean isValidArgs(int width, int height) {
        boolean valid = true;

        if (!validateWidth(width)) {
            logger.info("Width is not valid. It can be in the range of 2 to 100.");
            valid = false;
        }

        if (!validateHeight(height)) {
            logger.info("Height is not valid. It can be in the range of 2 to 100.");
            valid = false;
        }

        if (width != height) {
            logger.info("The width and height of the chessboard must be equal");
            valid = false;
        }

        return valid;
    }

    private boolean validateWidth(int width) {
        return width > 1 && width < 101;
    }

    private boolean validateHeight(int height) {
        return height > 1 && height < 101;
    }
}
