package model;

import model.board.Board;
import model.board.Cell;

import java.util.ArrayList;

public class TicTacToe extends Game {

    public TicTacToe() {
        super();
        super.board = new Board(3, 3);
    }
}