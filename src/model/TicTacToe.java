package model;

import model.board.Board;
import java.util.Scanner;

import static java.sql.DriverManager.println;

public class TicTacToe extends Game {
    private Board board;
    static Scanner input = new Scanner(System.in);

    public TicTacToe() {
        super();
        board = new Board(3, 3);
    }


    /**
     * Notes:
     * _ | _ | _
     * _ | _ | _
     * _ | _ | _
     * Indices du tableau
     * [0][0] , [0][1] , [0][2]
     * [1][0] , [1][1] , [1][2]
     * [2][0] , [2][1] , [2][2]
     **/

    public char[][] gameBoard = new char[][]{
            {'_', '|', '_', '|', '_'},
            {'_', '|', '_', '|', '_'},
            {' ', '|', ' ', '|', ' '}

    };
    printBoard(gameBoard);

}


    public void printBoard(char [][] gameBoard){

        for(char[] row : gameBoard){
            for( char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void playerMove(char[][] gameBoard){

        System.out.println("Où souhaitez vous aller ? (1-9)");
        int move = input.nextInt();
        updateBoard(move,1,gameBoard);
    }
}
