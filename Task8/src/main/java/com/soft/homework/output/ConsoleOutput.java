package com.soft.homework.output;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.List;

public class ConsoleOutput implements Output {
    private static final Logger logger = LoggerFactory.getLogger(ConsoleOutput.class);

    @Override
    public void printSequence(List<BigInteger> sequence) {
        logger.info(String.valueOf(sequence));
    }
}
