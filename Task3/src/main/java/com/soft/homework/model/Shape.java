package com.soft.homework.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    private List<Double> sides = new ArrayList<>();

    public List<Double> getSides() {
        return sides;
    }

    public void setSides(List<Double> sides) {
        this.sides = sides;
    }

    public abstract double getArea(Shape shape);
}


