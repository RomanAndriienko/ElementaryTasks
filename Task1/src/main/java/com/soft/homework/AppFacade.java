package com.soft.homework;

import com.soft.homework.chessboard.ChessBoard;
import com.soft.homework.chessboard.ChessBoardImpl;
import com.soft.homework.validator.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AppFacade {
    private static final Logger logger = LoggerFactory.getLogger(AppFacade.class);

    void startApp(String[] args) {
        if (args.length == 0) {
            ChessBoardImpl.showInfo();
        } else {
            try {
                int width = Integer.parseInt(args[0]);
                int height = Integer.parseInt(args[1]);

                Validator validator = new Validator();

                if (validator.isValidArgs(width, height)) {
                    ChessBoard chessBoard = new ChessBoardImpl(width, height);
                    chessBoard.printChessBoard(width, height);
                } else {
                    logger.info("Good luck next time !");
                }
            } catch (NumberFormatException e) {
                logger.info("Sorry, you can use only integers.");
            }
        }
    }
}

