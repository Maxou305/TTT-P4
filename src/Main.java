import view.Menu;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.start();
        Scanner scanner = new Scanner(System.in);
        Menu start = new Menu(scanner);
        start.gameMenu();

    }
}