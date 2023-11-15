import model.TicTacToe;
import model.player.HumanPlayer;
import model.player.Player;
import view.Menu;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        TicTacToe ticTacToe = new TicTacToe();
        Player player = new HumanPlayer('X', "XXX");
        ticTacToe.board.getCell(0,0).setSymbole(player.getSymbole());
        System.out.println(ticTacToe);


//        Controller controller = new Controller();
//        controller.start();
//        Scanner scanner = new Scanner(System.in);
//        Menu start = new Menu(scanner);
//        start.gameMenu();

    }
}