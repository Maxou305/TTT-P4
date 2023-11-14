package model;

import model.board.Board;
import model.player.Player;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private int playerTurn;
    private boolean isOver;

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

//    public void playGame() {
//        while (!isOver) {
//            board.displayBoard();
//            choseEmptyCase();
//            markCase();
//            checkWin();
//            nextTurn();
//        }
//    }

    public void boardIsFull() {
    }

//    public void markCase() {
//        switch (playerTurn) {
//            case 0 -> marquerX;
//            case 1 -> marquer0;
//        }
//    }

    public void choseEmptyCase() {
        Scanner eventUser = new Scanner(System.in);
        System.out.println("Où veux-tu mettre ton pion ?");
        int userChoice = eventUser.nextInt();
    }


}
