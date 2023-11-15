package model.player;

import java.util.Scanner;

public abstract class Player { //TODO retravailler la classe Player (ébauche)
    private char symbole;
    private String name;
    private String winCondition;

    public Player(char symbole, String name, String winCondition) {
        this.symbole = symbole;
        this.name = name;
        this.winCondition = winCondition;
    }

    public int[] makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", entre ton choix de case (ligne et colonne) : ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[]{row, col};
    }

    public char getSymbole() {
        return symbole;
    }

    public void setSymbole(char symbole) {
        this.symbole = symbole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
