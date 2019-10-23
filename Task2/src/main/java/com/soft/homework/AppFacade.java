package com.soft.homework;

import com.soft.homework.envelope.Envelope;
import com.soft.homework.envelope.EnvelopeComparator;
import com.soft.homework.validator.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

class AppFacade {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    private static final String Y = "y";
    private static final String YES = "yes";

    void startApp() {
        Scanner scanner = new Scanner(System.in);

        do {
            getArgs(scanner);
        } while (scanner.nextLine().equalsIgnoreCase(Y) || scanner.nextLine().equalsIgnoreCase(YES));
    }

    private static void getArgs(Scanner scanner) {
        logger.info("Enter the sides of the envelopes");

        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;

        try {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            d = scanner.nextDouble();
        } catch (Exception e) {
            logger.info("The sides of the envelope can only be integer or floating point numbers");
        }

        Validator validator = new Validator();

        if (validator.isArgsValid(a, b) && validator.isArgsValid(c, d)) {
            Envelope firstEnvelope = new Envelope(a, b);
            Envelope secondEnvelope = new Envelope(c, d);

            if (EnvelopeComparator.compareEnvelope(firstEnvelope, secondEnvelope)) {
                logger.info("You can put one envelope in another");
            } else {
                logger.info("You cannot put one envelope in another");
            }
        } else {
            logger.info("Good luck next time !");
        }
        logger.info("Would you like to continue? type 'y' or 'yes if you want to continue");
    }
}
