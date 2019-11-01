package com.soft.homework.service;

import com.soft.homework.data.ShapeData;
import com.soft.homework.model.Shape;

import java.util.List;

public interface Sorting {
    List<ShapeData> sort(List<Shape> shapes);
}
