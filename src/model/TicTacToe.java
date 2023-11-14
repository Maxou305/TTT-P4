package model;

import model.board.Board;
import model.board.Cell;

import java.util.ArrayList;

public class TicTacToe extends Game {
    private Board board;


    public TicTacToe() {
        super();
        board = new Board(3, 3);
    }

}

