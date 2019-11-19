package com.soft.homework.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciSequenceTest {
    private Sequence sequence;

    @Before
    public void setUp() {
        sequence = new FibonacciSequence();
    }

    @Test
    public void getSequenceInRange() {
        List<BigInteger> expected = new ArrayList<>();
        expected.add(BigInteger.valueOf(10946));
        expected.add(BigInteger.valueOf(17711));
        expected.add(BigInteger.valueOf(28657));
        expected.add(BigInteger.valueOf(46368));
        expected.add(BigInteger.valueOf(75025));

        List<BigInteger> actual = sequence
                .getSequenceInRange(BigInteger.valueOf(10000), BigInteger.valueOf(100000));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSequenceInRangeIfMaxNumberEqualsOne() {
        List<BigInteger> expected = new ArrayList<>();
        expected.add(BigInteger.ZERO);
        expected.add(BigInteger.ONE);
        expected.add(BigInteger.ONE);

        List<BigInteger> actual = sequence
                .getSequenceInRange(BigInteger.ZERO, BigInteger.ONE);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSequenceInRangeIfMinNumberEqualsZero() {
        List<BigInteger> expected = new ArrayList<>();
        expected.add(BigInteger.ZERO);
        expected.add(BigInteger.ONE);
        expected.add(BigInteger.ONE);
        expected.add(BigInteger.valueOf(2));
        expected.add(BigInteger.valueOf(3));
        expected.add(BigInteger.valueOf(5));
        expected.add(BigInteger.valueOf(8));

        List<BigInteger> actual = sequence
                .getSequenceInRange(BigInteger.ZERO, BigInteger.TEN);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSequenceByLengthNumber() {
        List<BigInteger> expected = new ArrayList<>();
        expected.add(BigInteger.valueOf(10946));
        expected.add(BigInteger.valueOf(17711));
        expected.add(BigInteger.valueOf(28657));
        expected.add(BigInteger.valueOf(46368));
        expected.add(BigInteger.valueOf(75025));

        List<BigInteger> actual = sequence
                .getSequenceByLengthNumber(BigInteger.valueOf(5));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSequenceByLengthNumberIfLengthNumberOne() {
        List<BigInteger> expected = new ArrayList<>();
        expected.add(BigInteger.ZERO);
        expected.add(BigInteger.ONE);
        expected.add(BigInteger.ONE);
        expected.add(BigInteger.valueOf(2));
        expected.add(BigInteger.valueOf(3));
        expected.add(BigInteger.valueOf(5));
        expected.add(BigInteger.valueOf(8));


        List<BigInteger> actual = sequence
                .getSequenceByLengthNumber(BigInteger.ONE);

        Assert.assertEquals(expected, actual);
    }
}