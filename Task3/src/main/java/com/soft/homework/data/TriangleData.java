package com.soft.homework.data;

public class TriangleData extends ShapeData {
    private String name;
    private double area;

    public TriangleData(String name, double area) {
        super(name, area);
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

}
