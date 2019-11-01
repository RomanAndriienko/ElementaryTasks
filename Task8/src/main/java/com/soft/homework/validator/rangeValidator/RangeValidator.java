package com.soft.homework.validator.rangeValidator;

import java.math.BigInteger;

public interface RangeValidator {
    boolean validate(BigInteger min, BigInteger max);
}
