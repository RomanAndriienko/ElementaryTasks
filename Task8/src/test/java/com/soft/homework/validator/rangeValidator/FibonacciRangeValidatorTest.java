package com.soft.homework.validator.rangeValidator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class FibonacciRangeValidatorTest {
    private RangeValidator validator;

    @Before
    public void setUp(){
        validator = new FibonacciRangeValidator();
    }

    @Test
    public void validateIfMinNumberLessThanMaxNumber() {
        boolean actual = validator.validate(BigInteger.ONE, BigInteger.TEN);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateIfMinNumberBiggerThanMaxNumber() {
        boolean actual = validator.validate(BigInteger.TEN, BigInteger.ONE);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateIfMinNumberEqualsMaxNumber() {
        boolean actual = validator.validate(BigInteger.TEN, BigInteger.ONE);
        Assert.assertFalse(actual);
    }

}