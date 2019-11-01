package com.soft.homework.validator.creationValidator;

import com.soft.homework.model.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleCreationValidator implements CreationValidator {
    private static final Logger logger = LoggerFactory.getLogger(TriangleCreationValidator.class);

    @Override
    public boolean canCreate(Shape shape) {
        boolean can = false;

        double sideA = shape.getSides().get(0);
        double sideB = shape.getSides().get(1);
        double sideC = shape.getSides().get(2);

        if (sideA == sideB && sideC == sideA && sideC == sideB) {
            can = true;
        }
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            can = true;
        }
        if (sideA + sideC > sideB && sideA + sideB > sideC && sideB + sideC > sideA) {
            can = true;
        }
        if (sideB + sideC > sideA && sideA + sideB > sideC && sideA + sideC > sideB) {
            can = true;
        }

        if (!can) {
            logger.info("We can't create triangle with such parameters");
        }

        return can;
    }
}
