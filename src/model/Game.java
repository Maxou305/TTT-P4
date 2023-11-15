package model;

import model.board.Board;
import model.player.HumanPlayer;
import model.player.Player;

import java.util.Scanner;

public class Game {
    public Board board;
    protected Player player1;
    protected Player player2;
    private Player currentPlayer;
    private boolean isOver;

    public void Game() {
        currentPlayer = player1;
        isOver = false;
    }

    public void nextPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public void playGame() {
        while (!isOver) {
            board.displayBoard();
            choseEmptyCase();
            checkWin();
            nextPlayer();
        }
    }

    public void boardIsFull() {
    }


    public void choseEmptyCase() { // todo déplacer dans TTT et P4 et préciser le comportmenet
        Scanner eventUser = new Scanner(System.in);
        System.out.println("Où veux-tu mettre ton pion ?");
        int userChoice = eventUser.nextInt();
        // pinger la bonne case
        markCase(userChoice);
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


    public void markCase(int userChoice) { // todo penser à afficher le numéro de la case
        board.setSymboleToCurrentCell(userChoice, currentPlayer.getSymbole());
    }

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