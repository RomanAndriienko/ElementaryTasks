package com.soft.homework.service;

import com.soft.homework.model.Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingByArea implements Sorting {
    @Override
    public List<Double> sort(List<Shape> shapes) {

        List<Double> result = new ArrayList<>();

        for (Shape shape : shapes) {
            double area = shape.getArea(shape);
            result.add(area);
        }

        Collections.sort(result);
        return result;
    }
}
