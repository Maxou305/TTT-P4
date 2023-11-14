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

    public Menu(Scanner scanner) {
        this.scanner = scanner;
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


        System.out.println("Quel jeu souhaitez vous lancer ?\n");
        System.out.println("[1] Tic tac Toe");
        System.out.println("[2] Puissance 4");
        System.out.println("[3] Quitter");
        int playerChoice = scanner.nextInt();
        return playerChoice;
    }

    public void gameMenu() {
        decoMenu();
        boolean isReady = false;
        Game game = new Game();

        // Tant que isReady est faux
        while (!isReady) {
            switch (displayStartMenu()) {
                case 1 -> {
                    new TicTacToe();
                }
                case 2 -> new Puissance4();
                case 3 -> {
                    System.out.println("Oh nooon vous avez quitté le jeu ! A bientôt :) ");
                    // isReady devient vrai ce qui permet de sortir de la boucle while
                    isReady = true;
                }
//                case 4 -> {
//
//                }
//                case 5 -> {
//
//                }
                default -> System.out.println("Veuillez entrer un choix valide !");
            }
        }
    }

}
