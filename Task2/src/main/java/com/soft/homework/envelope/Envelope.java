package com.soft.homework.envelope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Envelope {
    private static final Logger logger = LoggerFactory.getLogger(Envelope.class);

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

    double getMaxSide() {
        return getHeight() >= getWidth() ? getHeight() : getWidth();
    }

    double getMinSide() {
        return getHeight() <= getWidth() ? getHeight() : getWidth();

    }

    public static void showInfo() {
        logger.info("\n The program considers it possible to attach one envelope" +
                "\n to another. You need to enter the sides of the envelope." +
                "\n First, the sides of the first envelope, then the other.");
    }
}
