package model.board;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class Board {
    private ArrayList<Cell> data;
    private int rows;

    private int col;

    public Board(int rows, int col) {
        this.rows = rows;
        this.col = col;
        initBoardManip(rows, col);
    }

    public void initBoardManip(int rows, int columns) {
        this.data = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data.add(new Cell(i, j));
            }
        }
    }

    public void displayBoard() { // voir comment enlever les paramètres
        for (int i = 0; i < rows; i++) {
            System.out.print(" | ");
            for (int j = 0; j < col; j++) {
                System.out.print(data.get(i).getSymbole() + " | ");
            }
            System.out.println();
        }
    }

    public int getCellID(int x, int y) {
        return this.data.indexOf(data.stream().filter(cell -> cell.x == x && cell.y == y));
    }

    public Cell getCell(int x, int y) {
        Optional<Cell> result = this.data.stream().filter(cell -> cell.x == x && cell.y == y).findFirst();
        return result.get();
    }

    public void setSymboleToCurrentCell(int userChoice, char symbole) {
        data.get(userChoice).setSymbole(symbole);
    }


    public ArrayList<Cell> getDescendingDiagonal(int row, int col) {
        List<Cell> diag = data.stream()
                .filter(cell -> cell.x - cell.y == row - col)
                .collect(Collectors.toList());
        return (ArrayList<Cell>) diag;
    }

    public ArrayList<Cell> getAscendingDiagonal(int row, int col) {
        List<Cell> diag = data.stream()
                .filter(cell -> cell.x + cell.y == row + col)
                .collect(Collectors.toList());
        return (ArrayList<Cell>) diag;
    }

    public ArrayList<Cell> getColumn(int row, int col) {
        List<Cell> diag = data.stream()
                .filter(cell -> cell.x == row)
                .collect(Collectors.toList());
        return (ArrayList<Cell>) diag ;
    }

    public ArrayList<Cell> getLine(int x, int col) {
        List<Cell> diag = data.stream()
                .filter(cell -> cell.y == col)
                .collect(Collectors.toList());
        return (ArrayList<Cell>) diag ;
    }

    public ArrayList<Cell> getData() {
        return data;
    }

    public void setData(ArrayList<Cell> data) {
        this.data = data;
    }
}