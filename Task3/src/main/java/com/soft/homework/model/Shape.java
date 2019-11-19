package com.soft.homework.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    private List<Double> sides = new ArrayList<>();
    private String name;

    protected Shape (){}

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Double> getSides() {
        return sides;
    }

    void setSides(List<Double> sides) {
        this.sides = sides;
    }

    public abstract double getArea(Shape shape);

    public abstract void showInfo();
}


