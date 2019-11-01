package com.soft.homework.validator;

import com.soft.homework.model.Parcel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnvelopeValidator implements Validator {
    private static final Logger logger = LoggerFactory.getLogger(EnvelopeValidator.class);

    @Override
    public boolean validate(Parcel parcel) {
        boolean valid = true;

        double sideA = parcel.getSides().get(0);
        double sideB = parcel.getSides().get(1);

        if (validateSide(sideA) || validateSide(sideB)) {
            valid = false;
            logger.info("The side of the model cannot be negative and bigger than 2^31-1");
        }

        return valid;
    }

    private boolean validateSide(double side) {
        return !(side > 0) || !(side < Integer.MAX_VALUE);
    }
}
