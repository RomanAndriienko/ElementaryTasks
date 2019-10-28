package com.soft.homework.service;

import com.soft.homework.model.Shape;

import java.util.Comparator;
import java.util.List;

public class SortingByArea implements Sorting {
    @Override
    public void sort(List<Shape> shapes) {
        shapes.sort(Comparator.comparingDouble(Shape::getArea));
    }
}
