package com.soft.homework.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChessBoard {
    private static final Logger logger = LoggerFactory.getLogger(ChessBoard.class);
    private int width;
    private int height;

    public ChessBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static void showInfo() {
        logger.info("\n The program reads two parameters - the width and height" +
                "\n of the model. The minimum board is 2x2, the maximum " +
                "\n is 100 x 100. The board can only be square-form (5x5, 6x6, 7x7, etc.)");
    }
}
