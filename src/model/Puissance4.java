package model;

import model.board.Board;
import model.player.HumanPlayer;

public class Puissance4 extends Game{
    public Puissance4() {
        super();
        super.board = new Board(6, 7);
        this.player1 = new HumanPlayer('X', "JB", "XXXX");
        this.player2 = new HumanPlayer('O', "Guénael", "0000");
    }
}
