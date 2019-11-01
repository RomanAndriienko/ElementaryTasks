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

    public Triangle() {
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

    @Override
    public void showInfo() {
        logger.info("The program can count and sort triangles by their area." +
                "\nYou must enter the name of the triangle and its sides separated by commas." +
                "\nYou can use floating point numbers. Negative numbers should not be used.\n");
    }
}
