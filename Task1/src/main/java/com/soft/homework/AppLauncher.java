package com.soft.homework;

import com.soft.homework.model.ChessBoard;
import com.soft.homework.service.BoardPrinter;
import com.soft.homework.service.ChessBoardPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AppLauncher {
    private static final Logger logger = LoggerFactory.getLogger(AppLauncher.class);

    static void start(String[] args) {
        if (args.length != 2) {
            ChessBoard.showInfo();
        }

        if (args.length == 2) {
            try {
                int width = Integer.parseInt(args[0]);
                int height = Integer.parseInt(args[1]);

                Validator validator = new ChessBoardValidator();
                ChessBoard chessBoard = new ChessBoard(width, height);

                if (validator.validate(chessBoard)) {
                    printBoard(chessBoard);
                }

            } catch (NumberFormatException e) {
                logger.info("Sorry, you can use only integers.");
            }
        }
    }

    private static void printBoard(ChessBoard chessBoard) {
        BoardPrinter printer = new ChessBoardPrinter();
        printer.printBoard(chessBoard);
    }
}

