package com.soft.homework;

import com.soft.homework.data.ShapeData;
import com.soft.homework.model.Shape;
import com.soft.homework.model.Triangle;
import com.soft.homework.output.ConsoleOutput;
import com.soft.homework.output.Output;
import com.soft.homework.service.Sorting;
import com.soft.homework.service.SortingByArea;
import com.soft.homework.validator.creationValidator.CreationValidator;
import com.soft.homework.validator.creationValidator.TriangleCreationValidator;
import com.soft.homework.validator.inputValidator.InputValidator;
import com.soft.homework.validator.inputValidator.TriangleInputValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AppLauncher {
    private static final Logger logger = LoggerFactory.getLogger(AppLauncher.class);
    private static final String Y = "y";
    private static final String YES = "yes";

    private AppLauncher() {
    }

    static void start() {
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();
        String input = "";

        do {
            logger.info("Enter the name and sides of the triangle separated by a comma");

            String args = scanner.nextLine();
            String[] parseArgs = parseArgs(args);

            try {
                input = makeAllValidation(scanner, shapes, input, parseArgs);
            } catch (NumberFormatException e) {
                logger.info("Mistake. The first parameter is a string." +
                        "\nThe sides of the figure are numbers (floating point or integers)." +
                        "\nParameters should be entered with a comma." +
                        "\nGood luck next time.");
            }

        } while (isContinue(input));

        if (shapes.size() > 0) {
            getResult(shapes);
        }
    }

    private static String makeAllValidation(Scanner scanner, List<Shape> shapes,
                                            String input, String[] parseArgs) {
        InputValidator inputValidator = new TriangleInputValidator();
        if (inputValidator.validateArgs(parseArgs)) {
            Shape triangle = createTriangle(parseArgs);
            CreationValidator validator = new TriangleCreationValidator();
            if (validator.canCreate(triangle)) {
                shapes.add(triangle);
                logger.info("Would you like to continue? type 'y' or 'yes' if you want to continue");
                input = scanner.nextLine();
                input = input.replaceAll("//s", "");
            }
        }
        return input;
    }

    private static void getResult(List<Shape> shapes) {
        Sorting sorting = new SortingByArea();
        List<ShapeData> data = sorting.sort(shapes);
        Output out = new ConsoleOutput();
        out.printShape(data);
    }

    private static String[] parseArgs(String args) {
        args = args.replaceAll("\\s", "");
        return args.split(",");
    }

    private static Triangle createTriangle(String[] args) {
        String name = args[0];
        double sideA = Double.parseDouble(args[1]);
        double sideB = Double.parseDouble(args[2]);
        double sideC = Double.parseDouble(args[3]);

        return new Triangle(name, sideA, sideB, sideC);
    }

    private static boolean isContinue(String input) {
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

