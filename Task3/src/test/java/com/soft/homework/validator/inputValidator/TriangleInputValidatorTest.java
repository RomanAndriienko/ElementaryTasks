package com.soft.homework.validator.inputValidator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleInputValidatorTest {
    private InputValidator validator;

    @Before
    public void setUp() {
        validator = new TriangleInputValidator();
    }

    @Test
    public void validateArgsWithValidArgs() {
        String[] args = {"name", "4", "5", "6"};
        boolean expected = validator.validateArgs(args);

        Assert.assertTrue(expected);
    }

    @Test
    public void validateArgsWithNegativeSide() {
        String[] args = {"name", "-4", "5", "6"};
        boolean expected = validator.validateArgs(args);

        Assert.assertFalse(expected);
    }

    @Test
    public void validateArgsWithArgsLengthBiggerThanFour() {
        String[] args = {"name", "4", "5", "6", "1"};
        boolean expected = validator.validateArgs(args);

        Assert.assertFalse(expected);
    }

    @Test
    public void validateArgsWithArgsLengthLessThanFour() {
        String[] args = {"name", "5", "6"};
        boolean expected = validator.validateArgs(args);

        Assert.assertFalse(expected);
    }
}