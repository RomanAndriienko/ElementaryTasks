package com.soft.homework.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Parcel {
    private static final Logger logger = LoggerFactory.getLogger(Parcel.class);

    public abstract double getMaxSide();

    public abstract double getMinSide();


    public static void showInfo() {
        logger.info("\n The program considers it possible to attach one model" +
                "\n to another. You need to enter the sides of the model." +
                "\n First, the sides of the first model, then the other.");
    }
}
