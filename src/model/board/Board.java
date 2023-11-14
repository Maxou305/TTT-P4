package model.board;

import java.util.ArrayList;

public class Board {
    public ArrayList<ArrayList<Cell>> board_data;

    public Board(int rows, int columns) {
        initBoard(rows, columns);
    }

    private void initBoard (int rows, int columns) {
        board_data = new ArrayList<ArrayList<Cell>>();
        for (int i = 0; i < rows; i++) {
            board_data.add(new ArrayList<Cell>());
            for (int j = 0; j < columns; j++) {
                board_data.get(i).add(new Cell());
            }
        }
    }


    public void displayBoard() {
        System.out.println("  ___________  ");
        for (int i = 0; i < board_data.size(); i++) {
            System.out.print(" | ");
            for (int j = 0; j < board_data.get(i).size(); j++) {
                System.out.print(board_data.get(i).get(j).getSymbole() + " | ");
            }
            System.out.println();
            System.out.println("  ___________  ");
        }
    }

    public ArrayList<Cell> get_descending_diagonale(){
        ArrayList<Cell> diagonale = new ArrayList<>();
        diagonale.add( board_data.get(0).get(0) );
        diagonale.add( board_data.get(1).get(1) );
        diagonale.add( board_data.get(2).get(2) );
        return diagonale;

    }
}