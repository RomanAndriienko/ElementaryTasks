package com.soft.homework;

import com.soft.homework.validator.EnvelopeValidator;
import com.soft.homework.validator.Validator;
import com.soft.homework.model.Envelope;
import com.soft.homework.model.Parcel;
import com.soft.homework.service.Comparator;
import com.soft.homework.service.EnvelopeComparator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

class AppLauncher  {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    private static final String Y = "y";
    private static final String YES = "yes";

    static void start() throws InputMismatchException {
        Parcel.showInfo();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            getArgsForEnvelope(scanner);
            input = scanner.next();
        } while (isContinue(input));
    }

    private static void getArgsForEnvelope(Scanner scanner) {
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;

        try {
            logger.info("\n Enter the side A of first envelope");
            a = scanner.nextDouble();
            logger.info("\n Enter the side B of first envelope");
            b = scanner.nextDouble();
            logger.info("\n Enter the side A of second envelope");
            c = scanner.nextDouble();
            logger.info("\n Enter the side B of second envelope");
            d = scanner.nextDouble();
        } catch (InputMismatchException e) {
            logger.info("\n The sides of the model can only be integer or floating point numbers");
        }

        AnalyzeEnvelope(a, b, c, d);

        logger.info("\n Would you like to continue? type 'y' or 'yes' if you want to continue");
    }

    private static void AnalyzeEnvelope(double a, double b, double c, double d) {
        Validator validator = new EnvelopeValidator();
        Envelope firstEnvelope = new Envelope(a, b);
        Envelope secondEnvelope = new Envelope(c, d);

        if (validator.validate(firstEnvelope) && validator.validate(secondEnvelope)) {

            Comparator comparator = new EnvelopeComparator();

            if (comparator.compare(firstEnvelope, secondEnvelope)) {
                logger.info("\n You can put one model in another");
            } else {
                logger.info("\n You cannot put one model in another");
            }
        }
    }

    private static boolean isContinue (String input) {
        boolean isContinue = false;

        if (input.equalsIgnoreCase(Y)) {
            isContinue = true;
        }

        if (input.equalsIgnoreCase(YES)) {
            isContinue = true;
        }
        return isContinue;
    }
}
