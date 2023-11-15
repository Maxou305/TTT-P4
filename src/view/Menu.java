package view;

import model.Game;
import model.Puissance4;
import model.TicTacToe;
import model.player.Player;

import java.util.Scanner;

public class Menu { // TODO premières ébauches d'affichage du jeu

    private Scanner scanner;
    public Player player1;
    public Player player2;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    private void decoMenu() {
        System.out.println("\n" +
                "          ██████  ██       █████  ██    ██      ██████   █████  ███    ███ ███████ ███████           \n" +
                "▄ ██ ▄    ██   ██ ██      ██   ██  ██  ██      ██       ██   ██ ████  ████ ██      ██          ▄ ██ ▄\n" +
                " ████     ██████  ██      ███████   ████       ██   ███ ███████ ██ ████ ██ █████   ███████      ████ \n" +
                "▀ ██ ▀    ██      ██      ██   ██    ██        ██    ██ ██   ██ ██  ██  ██ ██           ██     ▀ ██ ▀\n" +
                "          ██      ███████ ██   ██    ██         ██████  ██   ██ ██      ██ ███████ ███████           \n" +
                "                                                                                                     \n" +
                "                                                                                                     \n");
    }

    public int displayStartMenu() {
        decoMenu();
        System.out.println("Quel jeu souhaitez vous lancer ?\n");
        System.out.println("[1] Tic tac Toe");
        System.out.println("[2] Puissance 4");
        System.out.println("[3] Quitter");
        int playerChoice = scanner.nextInt();
        return playerChoice;
    }


}
