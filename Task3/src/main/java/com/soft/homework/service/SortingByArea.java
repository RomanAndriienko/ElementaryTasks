package com.soft.homework.service;

import com.soft.homework.data.ShapeData;
import com.soft.homework.data.TriangleData;
import com.soft.homework.model.Shape;

import java.util.ArrayList;
import java.util.List;

public class SortingByArea implements Sorting {
    @Override
    public List<ShapeData> sort(List<Shape> shapes) {
        List<ShapeData> result = new ArrayList<>();

        for (Shape shape : shapes) {
            double area = Math.round(shape.getArea(shape) * 100.0) / 100.0;
            System.out.println(area);
            ShapeData dto = new TriangleData(shape.getName(), area);
            result.add(dto);
        }

        result.sort((o1, o2) -> Double.compare(o2.getArea(), o1.getArea()));

        return result;
    }
}
