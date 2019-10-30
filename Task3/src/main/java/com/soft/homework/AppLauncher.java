package com.soft.homework;

import com.soft.homework.dto.ShapeDTO;
import com.soft.homework.model.Shape;
import com.soft.homework.model.Triangle;
import com.soft.homework.output.Output;
import com.soft.homework.output.TriangleOutput;
import com.soft.homework.service.Sorting;
import com.soft.homework.service.SortingByArea;
import com.soft.homework.validator.TriangleValidator;
import com.soft.homework.validator.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

class AppLauncher {
    private static final Logger logger = LoggerFactory.getLogger(AppLauncher.class);

    private AppLauncher() {
    }

    //TODO all
    static void start(String [] args) {
        Shape firstTriangle = new Triangle(args[0], Double.parseDouble(args[1]),
                Double.parseDouble(args[2]), Double.parseDouble(args[3]));

        Shape secondTriangle = new Triangle(args[4], Double.parseDouble(args[5]),
                Double.parseDouble(args[6]), Double.parseDouble(args[7]));

        Shape thirdTriangle = new Triangle(args[8], Double.parseDouble(args[9]),
                Double.parseDouble(args[10]), Double.parseDouble(args[11]));


        Validator validator = new TriangleValidator();

        if (validator.validate(firstTriangle) && validator.validate(secondTriangle)
                && validator.validate(thirdTriangle)) {
            List<Shape> shapes = new ArrayList<>();
            shapes.add(firstTriangle);
            shapes.add(secondTriangle);
            shapes.add(thirdTriangle);

            Sorting sorting = new SortingByArea();
            List<ShapeDTO> shapeDTOS = sorting.sort(shapes);

            Output output = new TriangleOutput();
            output.printShape(shapeDTOS);
        }
    }
}
