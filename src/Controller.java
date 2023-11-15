import model.Game;
import model.Puissance4;
import model.TicTacToe;
import model.player.HumanPlayer;
import model.player.Player;
import view.Menu;

public class Controller {
    private Game game;
    private Menu menu;

    Controller() {
        menu = new Menu();
    }

    public void start() {
        switch (menu.displayStartMenu()) {
            case 1 -> {
                game = new TicTacToe();
                game.playGame();
            }
            case 2 -> {
                game = new Puissance4();
                game.playGame();
            }
            case 3 -> {
                System.out.println("Oh nooon vous avez quitté le jeu ! A bientôt :) ");
                // isReady devient vrai ce qui permet de sortir de la boucle while
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

