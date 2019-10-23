package com.soft.homework.chessboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChessBoardImpl implements ChessBoard {
    private static final Logger logger = LoggerFactory.getLogger(ChessBoardImpl.class);

    private int width;
    private int height;

    public ChessBoardImpl(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void printChessBoard (int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0 ; j < height; j++){
                String out = i % 2 == 0 ? "* " : " *";
                System.out.print(out);
            }
           System.out.println();
        }
    }

    public static void showInfo () {
        logger.info("\n The program reads two parameters - the width and height" +
                "\n of the chessboard. The minimum board is 2x2, the maximum " +
                "\n is 100 x 100. The board can only be square-form (5x5, 6x6, 7x7, etc.)");
    }
}
