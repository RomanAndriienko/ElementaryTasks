package com.soft.homework.validator;

import com.soft.homework.model.Envelope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnvelopeValidator implements Validator {
    private static final Logger logger = LoggerFactory.getLogger(EnvelopeValidator.class);

    @Override
    public boolean validate(Envelope envelope) {
        boolean valid = true;

        if (!validateSide(envelope.getHeight()) || !validateSide(envelope.getWidth())) {
            valid = false;
            logger.info("\n The side of the model cannot be negative and bigger than 2^31-1");
        }

        return valid;
    }

    /* Here is a hint from idea that this method always inverted
    And it wants to change to : return !(side > 0) || !(side < Integer.MAX_VALUE);
    But I don't understand what difference */

    private boolean validateSide(double side) {
        return side > 0 && side < Integer.MAX_VALUE;
    }
}
