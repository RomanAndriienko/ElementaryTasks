package com.soft.homework;

import com.soft.homework.model.FibonacciSequence;
import com.soft.homework.model.Sequence;
import com.soft.homework.output.ConsoleOutput;
import com.soft.homework.output.Output;
import com.soft.homework.validator.inputValidator.InputValidator;
import com.soft.homework.validator.inputValidator.NumberValidator;
import com.soft.homework.validator.rangeValidator.FibonacciRangeValidator;
import com.soft.homework.validator.rangeValidator.RangeValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.List;

class AppLauncher {
    private static final Logger logger = LoggerFactory.getLogger(AppLauncher.class);

    private AppLauncher() {
    }

    static void start(String[] args) {
        if (args.length == 0 || args.length > 2) {
            Sequence sequence = new FibonacciSequence();
            sequence.showInfo();
        }

        try {
            if (args.length == 1) {
                getSequence(args[0]);
            }

            if (args.length == 2) {
                getSequence(args);
            }

        } catch (NumberFormatException e) {
            logger.info("Sorry, you can use only integers");
        }
    }

    private static void getSequence(String[] args) {
        BigInteger min = new BigInteger(args[0]);
        BigInteger max = new BigInteger(args[1]);
        InputValidator numberValidator = new NumberValidator();
        RangeValidator rangeValidator = new FibonacciRangeValidator();

        if (numberValidator.validate(min) && numberValidator.validate(max)
                && rangeValidator.validate(min, max)) {
            Sequence sequence = new FibonacciSequence();
            List<BigInteger> fibonacciSequence = sequence.getSequenceInRange(min, max);
            print(fibonacciSequence);
        }
    }

    private static void getSequence(String arg) {
        BigInteger lengthNumber = new BigInteger(arg);
        InputValidator validator = new NumberValidator();

        if (validator.validate(lengthNumber)) {
            Sequence sequence = new FibonacciSequence();
            List<BigInteger> fibonacciSequence = sequence.getSequenceByLengthNumber(lengthNumber);
            print(fibonacciSequence);
        }
    }

    private static void print(List<BigInteger> fibonacciSequence) {
        Output out = new ConsoleOutput();
        out.printSequence(fibonacciSequence);
    }
}
