package com.soft.homework.validator;

import com.soft.homework.model.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleValidator implements Validator {
    private static final Logger logger = LoggerFactory.getLogger(TriangleValidator.class);

    @Override
    public boolean validate(Shape shape) {
        boolean valid = true;

        //TODO
        double sideA = shape.getSides().get(0);
        double sideB = shape.getSides().get(1);
        double sideC = shape.getSides().get(2);

        if (!canCreate(shape)) {
            valid = false;
            logger.info("We can't create the triangle with such parameters");
        }



        return valid;
    }

    private boolean canCreate(Shape shape) {
        boolean can = true;


        return can;
    }

    private boolean validateSide (double side) {
        boolean valid = true;

        double max = Double.MAX_VALUE - 1;

        if (side < 0.1 || side > Double.MAX_VALUE - 1) {
            valid = false;
            logger.info("Side of triangle can't be less than 0.1cm or bigger than " + max);
        }

        return valid;
    }
}
