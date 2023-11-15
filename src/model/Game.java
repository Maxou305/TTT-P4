package model;

import model.board.Board;
import model.player.Player;

import java.util.Scanner;

public class Game {
    public Board board;
    private Player player1;
    private Player player2;
    private int playerTurn;

    private Player currentPlayer;

    private boolean isOver;

    public void Game() {
        playerTurn = 0;
        currentPlayer = player1;
        isOver = false;
    }

//    public void nextPlayer(){
//        if (currentPlayer == player1) {
//            currentPlayer = player2;
//        } else {
//            currentPlayer = player1;
//        }
//    }

    public void nextTurn() {
        if (playerTurn == 0) {
            playerTurn++;
        } else {
            playerTurn--;
        }
    }

    public void playGame() {
        while (!isOver) {
//            board.displayBoard();
            choseEmptyCase();
            checkWin();
            nextTurn();
        }
    }

    public void boardIsFull() {
    }


    public void choseEmptyCase() { // todo déplacer dans TTT et P4 et préciser le comportmenet
        Scanner eventUser = new Scanner(System.in);
        System.out.println("Où veux-tu mettre ton pion ?");
        int userChoice = eventUser.nextInt();
        // pinger la bonne case
//        markCase(userChoice);
    }

    public void checkWin() {

//        checkVerticalWin();
//        checkHorizontalWin();
//        checkDiagonalWin();
    }

    public void checkVerticalWin(String winCondition, int x, int y) {
        if (board.getColumn(x, y).contains(winCondition)) {
            System.out.println("YOU ARE THE WINNER");
            isOver = true;
        }
    }

//    public void markCase(int userChoice) { // todo penser à afficher le numéro de la case
//
//        switch (playerTurn) {
//            case 0 -> board.setSymboleToCurrentCell(, 'X');
//            case 1 -> board.setSymboleToCurrentCell(userChoice, 'O');
//        }
//    }
//
//
//    public void markCase(int userChoice) { // todo penser à afficher le numéro de la case
//        board.setSymboleToCurrentCell(, currentPlayer.getSymbole() );
//
//    }

    public void checkHorizontalWin(String winCondition, int x, int y) {
        if (board.getLine(x, y).contains(winCondition)) {
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