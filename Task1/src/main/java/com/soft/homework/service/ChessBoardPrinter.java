package com.soft.homework.service;

import com.soft.homework.model.ChessBoard;

public class ChessBoardPrinter implements BoardPrinter {
    @Override
    public void printBoard(ChessBoard chessBoard) {
        for (int i = 0; i < chessBoard.getWidth(); i++) {
            for (int j = 0 ; j < chessBoard.getHeight(); j++){
                String out = i % 2 == 0 ? "* " : " *";
                System.out.print(out);
            }
            System.out.println();
        }
    }

}
