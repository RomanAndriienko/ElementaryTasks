package com.soft.homework;

import com.soft.homework.validator.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AppLauncher {
    private static final Logger logger = LoggerFactory.getLogger(AppLauncher.class);

    static void start(String[] args) {
        if (args.length == 2) {
            try {
                int num = Integer.parseInt(args[0]);
                int degree = Integer.parseInt(args[1]);
                Validator validator = new Validator();

                if (validator.validateArgs(num, degree)) {
                    logger.info(String.valueOf(calculate(num, degree)));
                }
            } catch (NumberFormatException e) {
                showInfo();
            }
        } else {
            showInfo();
        }
    }

    private static long calculate(int num, int degree) {
        long result = 1;

        for (int i = 1; i <= degree; i++) {
            result = result * num;
        }

        return result;
    }

    private static void showInfo() {
        logger.info("\nThe program exponents a number. The first argument is a number." +
                "\nThe second is the degree. Arguments must be positive integers.");
    }
}
