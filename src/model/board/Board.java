package model.board;

import java.util.ArrayList;

public class Board {
    private ArrayList<Cell> board;

    public Board(int column, int line) {
        board = new ArrayList<>();
    }
}