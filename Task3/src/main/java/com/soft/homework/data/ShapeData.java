package com.soft.homework.data;

public abstract class ShapeData {
    private String name;
    private double area;

    ShapeData(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "ShapeData{" +
                "name='" + getName() + '\'' +
                ", area=" + getArea() +
                '}';
    }
}
