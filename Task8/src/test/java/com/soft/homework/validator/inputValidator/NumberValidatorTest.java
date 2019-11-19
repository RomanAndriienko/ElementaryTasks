package com.soft.homework.validator.inputValidator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class NumberValidatorTest {
    private InputValidator validator;

    @Before
    public void setUp() {
        validator = new NumberValidator();
    }

    @Test
    public void validateWithNumberLessThanZero() {
        boolean actual = validator.validate(BigInteger.valueOf(-100));

        Assert.assertFalse(actual);
    }

    @Test
    public void validateWithNumberBiggerThanZero() {
        boolean actual = validator.validate(BigInteger.valueOf(100));

        Assert.assertTrue(actual);
    }
}