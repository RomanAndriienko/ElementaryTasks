package com.soft.homework.service;

public class ChessBoardPrinter implements BoardPrinter {
    @Override
    public void printBoard(int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0 ; j < height; j++){
                String out = i % 2 == 0 ? "* " : " *";
                System.out.print(out);
            }
            System.out.println();
        }
    }

}
