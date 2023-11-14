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

    public void checkWin() {
        checkVerticalWin();
        checkHorizontalWin();
        checkDiagonalWin();
    }

    public boolean checkVerticalWin() { // todo attention il faut gérer le cas où toutes les cases sont vides !
        for (int i = 0; i < 3; i++) {
//            return getBoard().getColumn(i).stream().distinct().count() <= 1;
            if (board.getBoard().getColums(i).contains("XXXX")) {
                System.out.println("Player X a gagné youhouuu");
                return true;
            }
            if (board.getBoard().getColums(i).contains("OOOO")) {
                System.out.println("Player O a gagné youpiiiiii");
                return true;
            }
        }
        return false;
    }

    public boolean checkHorizontalWin() { // todo attention il faut gérer le cas où toutes les cases sont vides !
        for (ArrayList<Cell> line : getBoard()) {
            if (line.contains("XXXX")){
                System.out.println("Player X a gagné youhouuu");
            }
            else if (line.contains("OOOO")){
                System.out.println("Player O a gagné youpiiiiii");
            }
        }
        return false;
    }

    public boolean checkDiagonalWin() { // todo attention il faut gérer le cas où toutes les cases sont vides !
        for (int i = 0; i < 3; i++) {
//            return getBoard().getDiagonal(i).stream().distinct().count() <= 1;
            if (board.getBoards().getColums(i).contains("XXXX")) {
                System.out.println("Player X a gagné youhouuu");
                return true;
            }
            if (board.getBoard().getDiagonal(i).contains("OOOO")) {
                System.out.println("Player O a gagné youpiiiiii");
                return true;
            }
        }
        return false;
    }
}
