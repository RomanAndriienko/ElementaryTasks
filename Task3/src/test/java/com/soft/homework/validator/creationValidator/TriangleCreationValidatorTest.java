package com.soft.homework.validator.creationValidator;

import com.soft.homework.model.Shape;
import com.soft.homework.model.Triangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleCreationValidatorTest {
    private CreationValidator validator;

    @Before
    public void setUp() {
        validator = new TriangleCreationValidator();
    }

    @Test
    public void canCreateWithDifferentSides() {
        Shape shape = new Triangle("name", 4, 5, 6);

        boolean expected = validator.canCreate(shape);

        Assert.assertTrue(expected);
    }

    @Test
    public void canCreateWithEqualsSides () {
        Shape shape = new Triangle("name", 5, 5, 5);

        boolean expected = validator.canCreate(shape);

        Assert.assertTrue(expected);
    }

    @Test
    public void cantCreateWithInvalidParams () {
        Shape shape = new Triangle("name", 5, 100, 5);

        boolean expected = validator.canCreate(shape);

        Assert.assertFalse(expected);
    }
}