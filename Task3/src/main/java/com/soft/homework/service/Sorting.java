package com.soft.homework.service;

import com.soft.homework.dto.ShapeDTO;
import com.soft.homework.model.Shape;

import java.util.List;

public interface Sorting {
    List<ShapeDTO> sort(List<Shape> shapes);
}
