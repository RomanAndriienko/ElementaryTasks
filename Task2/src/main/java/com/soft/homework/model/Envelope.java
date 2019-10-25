package com.soft.homework.model;

public class Envelope extends Parcel {
    private double width;
    private double height;

    public Envelope(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getMaxSide() {
        return getHeight() >= getWidth() ? getHeight() : getWidth();
    }

    public double getMinSide() {
        return getHeight() <= getWidth() ? getHeight() : getWidth();

    }
}
