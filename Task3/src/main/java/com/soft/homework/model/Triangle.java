package com.soft.homework.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Shape {
    private static final Logger logger = LoggerFactory.getLogger(Triangle.class);

    private String name;
    private double sideA;
    private double sideB;
    private double sideC;

    private List<Double> sides = new ArrayList<>();

    @Override
    public String toString() {
        return getName() + " " + getSideA() + " " + getSideB() + " " + getSideC();
    }

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        addSides(sideA, sideB, sideC);
    }

    private void addSides(double sideA, double sideB, double sideC) {
        List<Double> sides = new ArrayList<>();
        sides.add(sideA);
        sides.add(sideB);
        sides.add(sideC);
        setSides(sides);
    }

    public String getName() {
        return name;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

//    @Override
//    public List<Double> getSides() {
//        return sides;
//    }

//    @Override
//    public void setSides(List<Double> sides) {
//        sides.add(getSideA());
//        sides.add(getSideB());
//        sides.add(getSideC());
//    }


    @Override
    public double getArea(Shape shape) {
        if (shape.getSides().size() != 3) {
            logger.info("It's not a triangle");
        }

        double a = shape.getSides().get(0);
        double b = shape.getSides().get(1);
        double c = shape.getSides().get(2);

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
