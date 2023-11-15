package model.board;

import java.util.List;
import java.awt.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Board {
    public ArrayList<ArrayList<Cell>> board_data;
    private ArrayList<Cell> board;

    public Board(int rows, int columns) {
        initBoard(rows, columns);
        initBoardManip(rows, columns);
    }

    private void initBoard(int rows, int columns) {
        board_data = new ArrayList<ArrayList<Cell>>();
        for (int i = 0; i < rows; i++) {
            board_data.add(new ArrayList<Cell>());
            for (int j = 0; j < columns; j++) {
                board_data.get(i).add(new Cell(i, j));
            }
        }
    }

    private void initBoardManip(int rows, int columns) {
        this.board = new ArrayList<Cell>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.board.add(new Cell(i, j));
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < board_data.size(); i++) {
            System.out.print(" | ");
            for (int j = 0; j < board_data.get(i).size(); j++) {
                System.out.print(board_data.get(i).get(j).getSymbole() + " | ");
            }
            System.out.println();
        }
    }


    public ArrayList<Cell> getDescendingDiagonal(int row, int col) {
        List<Cell> diag = board.stream()
                .filter(cell -> cell.x - cell.y == row - col)
                .collect(Collectors.toList());
        return (ArrayList<Cell>) diag;

    }


    public ArrayList<Cell> getAscendingDiagonal(int row, int col) {
        List<Cell> diag = board.stream()
                .filter(cell -> cell.x + cell.y == row + col)
                .collect(Collectors.toList());
        return (ArrayList<Cell>) diag;
    }

    private boolean isValidCell(int row, int col) {
        return row >= 0 && row < board_data.size() && col >= 0 && col < board_data.get(0).size();
    }

    public void updateBoard(int position, int player, char[][] gameBoard) {

        char symbole;

        if (player == 1) {
            symbole = 'X';
        } else {
            symbole = 'O';
        }

        switch (position) {

            case 1:
                gameBoard[0][0] = symbole;
                displayBoard();
                break;
            case 2:
                gameBoard[0][1] = symbole;
                displayBoard();
                break;
            case 3:
                gameBoard[0][2] = symbole;
                displayBoard();
                break;
            case 4:
                gameBoard[1][0] = symbole;
                displayBoard();
                break;
            case 5:
                gameBoard[1][1] = symbole;
                displayBoard();
                break;
            case 6:
                gameBoard[1][2] = symbole;
               displayBoard();
                break;
            case 7:
                gameBoard[2][0] = symbole;
                displayBoard();
                break;
            case 8:
                gameBoard[2][1] = symbole;
                displayBoard();
                break;
            case 9:
                gameBoard[2][2] = symbole;
                displayBoard();
                break;

            default:
                break;
        }
    }


    public ArrayList<ArrayList<Cell>> getBoard_data() {
        return board_data;
    }

    public void setBoard_data(ArrayList<ArrayList<Cell>> board_data) {
        this.board_data = board_data;
    }

    public ArrayList<Cell> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Cell> board) {
        this.board = board;
    }
}