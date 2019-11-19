package com.soft.homework.model;

import java.util.ArrayList;
import java.util.List;

public class Envelope extends Parcel {
    private double width;
    private double height;

    private List<Double> sides = new ArrayList<>();

    @Override
    public List<Double> getSides() {
        return sides;
    }

    @Override
    public void setSides(List<Double> sides) {
        this.sides = sides;
    }

    public Envelope(double width, double height) {
        this.width = width;
        this.height = height;
        addSides(width, height);
    }

    private double getWidth() {
        return width;
    }

    private double getHeight() {
        return height;
    }

    public double getMaxSide() {
        return getHeight() >= getWidth() ? getHeight() : getWidth();
    }

    public double getMinSide() {
        return getHeight() <= getWidth() ? getHeight() : getWidth();

    }

    private void addSides(double width, double height) {
        List<Double> sides = new ArrayList<>();
        sides.add(width);
        sides.add(height);
        setSides(sides);
    }
}
