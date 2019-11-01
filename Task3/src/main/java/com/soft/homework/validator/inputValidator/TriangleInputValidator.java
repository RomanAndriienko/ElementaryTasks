package com.soft.homework.validator.inputValidator;

import com.soft.homework.model.Shape;
import com.soft.homework.model.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleInputValidator implements InputValidator {
    private static final Logger logger = LoggerFactory.getLogger(TriangleInputValidator.class);

    @Override
    public boolean validateArgs(String[] args) {
        boolean valid = true;

        if (args.length != 4) {
            Shape shape = new Triangle();
            shape.showInfo();
            valid = false;
        }

        for (int i = 1; i < args.length; i++) {
            if (!validateSide(Double.parseDouble(args[i]))) {
                valid = false;
            }
        }

        return valid;
    }

    private boolean validateSide(double side) {
        boolean valid = true;

        double max = Double.MAX_VALUE - 1;

        if (side < 0.1 || side > Double.MAX_VALUE - 1) {
            valid = false;
            logger.info("Side of shape can't be less than 0.1cm or bigger than " + max + "cm");
        }

        return valid;
    }
}
