package com.soft.homework.service;

import com.soft.homework.dto.ShapeDTO;
import com.soft.homework.dto.TriangleDTO;
import com.soft.homework.model.Shape;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingByArea implements Sorting {
    @Override
    public List<ShapeDTO> sort(List<Shape> shapes) {

        List<ShapeDTO> result = new ArrayList<>();

        for (Shape shape : shapes) {
            double area = shape.getArea(shape);
            String name = shape.getName();
            ShapeDTO dto = new TriangleDTO(name, area);
            result.add(dto);
        }

        result.sort(Comparator.comparingDouble(ShapeDTO::getArea));

        return result;
    }
}
