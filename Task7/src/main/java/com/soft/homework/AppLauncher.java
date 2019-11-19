package com.soft.homework;

import com.soft.homework.validator.IValidator;
import com.soft.homework.validator.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

class AppLauncher {
    private static final Logger logger = LoggerFactory.getLogger(AppLauncher.class);
    private static final int POW = 2;

    static void start(String[] args) {
        if (args.length == 1) {
            try {
                int num = Integer.parseInt(args[0]);
                IValidator validator = new Validator();

                if (validator.validateNumber(num)) {
                    List<Integer> result = calculate(num);
                    logger.info(String.valueOf(result));
                }
            } catch (NumberFormatException e) {
               logger.info("The number should not be negative or bigger 2^31 - 1");
            }
        } else {
            showInfo();
        }
    }

    private static List<Integer> calculate(int num) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; Math.pow(i, POW) < num; i++) {
            result.add(i);
        }
        return result;
    }

    private static void showInfo() {
        logger.info("The program displays a row of integers," +
                "\nthe square of which is less than the given.");
    }
}
