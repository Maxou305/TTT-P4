package model;

import model.board.Board;
import model.board.Cell;
import model.player.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private int playerTurn;
    private boolean isOver;
    private String winConditionPlayer1;
    private String winConditionPlayer2;

    public void Game() {
        playerTurn = 0;
        isOver = false;
    }

    public void nextTurn() {
        if (playerTurn == 0) {
            playerTurn++;
        } else {
            playerTurn--;
        }
    }

    public void playGame() {
        while (!isOver) {
            board.displayBoard();
            choseEmptyCase();
            checkWin();
            nextTurn();
        }
    }

    public void boardIsFull() {
    }

//    public void markCase() {
//        switch (playerTurn) {
//            case 0 -> marquerX;
//            case 1 -> marquer0;
//        }
//    }

    public void choseEmptyCase() { // todo faire en sorte de pinger la case (changer Symbole)
        Scanner eventUser = new Scanner(System.in);
        System.out.println("Où veux-tu mettre ton pion ?");
        int userChoice = eventUser.nextInt();
        // pinger la bonne case
        markCase();
    }

    public void checkWin() {
        checkVerticalWin();
        checkHorizontalWin();
        checkDiagonalWin();
    }

    public void checkVerticalWin(String winCondition, int x, int y) {
        if (board.getBoard_data().getColums(x, y).contains(winCondition)) {
            System.out.println("YOU ARE THE WINNER");
            isOver = true;
        }
    }

    public void markCase() {
        switch (playerTurn){
            case 0 -> cell; // "X";
            case 1 -> marl "O";
        }
    }

    public void checkHorizontalWin(String winCondition, int x, int y) {
        if (board.getBoard_data().getLine(x, y).contains(winCondition)) {
            System.out.println("YOU ARE THE WINNER");
            isOver = true;
        }
    }

    public void checkDiagonalWin(String winCondition, int x, int y) {
        if (board.getAscendingDiagonal(x, y).contains(winCondition) || board.getDescendingDiagonal(x, y).contains(winCondition)) {
            System.out.println("T'AS GAGNE COOL");
        }
    }
}