package model;

import model.board.Board;

public class TicTacToe extends Game {
    private Board board;

    public TicTacToe() {
        super();
        board = new Board(3, 3);
    }

    public void checkWin(){

    }

}
