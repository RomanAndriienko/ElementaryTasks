package com.soft.homework;

import com.soft.homework.model.ChessBoard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChessBoardValidator implements Validator {
    private static final Logger logger = LoggerFactory.getLogger(ChessBoardValidator.class);

    @Override
    public boolean validate(ChessBoard chessBoard) {
        boolean valid = true;

        if (validateSide(chessBoard.getWidth())) {
            logger.info("Width is not valid. It can be in the range of 2 to 100.");
            valid = false;
        }

        if (validateSide(chessBoard.getHeight())) {
            logger.info("Height is not valid. It can be in the range of 2 to 100.");
            valid = false;
        }

        if (chessBoard.getWidth() != chessBoard.getHeight()) {
            logger.info("The width and height of the model must be equal");
            valid = false;
        }

        return valid;
    }

    private boolean validateSide(int side) {
        return side <= 1 || side >= 101;
    }
}
