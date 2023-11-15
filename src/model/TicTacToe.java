package model;

import model.board.Board;
import model.player.HumanPlayer;


public class TicTacToe extends Game {

    public TicTacToe() {
        super();
        super.board = new Board(3, 3);
        this.player1 = new HumanPlayer('X', "JB", "XXX");
        this.player2 = new HumanPlayer('O', "Guénael", "000");
    }
}