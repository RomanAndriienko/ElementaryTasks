package com.soft.homework.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Parcel {
    private static final Logger logger = LoggerFactory.getLogger(Parcel.class);

    private List<Double> sides = new ArrayList<>();

    public List<Double> getSides() {
        return sides;
    }

    public void setSides(List<Double> sides) {
        this.sides = sides;
    }

    public abstract double getMaxSide();

    public abstract double getMinSide();


    public static void showInfo() {
        logger.info("\n The program considers it possible to attach one model" +
                "\n to another. You need to enter the sides of the model." +
                "\n First, the sides of the first model, then the other.");
    }
}
