package com.soft.homework;

import com.soft.homework.model.Shape;
import com.soft.homework.model.Triangle;
import com.soft.homework.output.Output;
import com.soft.homework.output.TriangleOutput;
import com.soft.homework.service.Sorting;
import com.soft.homework.service.SortingByArea;

import java.util.ArrayList;
import java.util.List;

class AppLauncher {
    static void start() {
        List<Shape> shapes = new ArrayList<>();

        Shape shape1 = new Triangle("name1", 1, 2, 3);
        Shape shape2 = new Triangle("name2", 4, 4, 4);
        Shape shape3 = new Triangle("name3", 1, 1, 1);

        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);

        Sorting sorting = new SortingByArea();
        sorting.sort(shapes);

        Output out = new TriangleOutput();
        out.printShape(shapes);
    }
}
