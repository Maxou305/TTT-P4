package model.board;

public class Cell {
    private char Symbole;

    public Cell() {
        this.Symbole = 'O';
    }

    public char getSymbole() {
        return Symbole;
    }

    public void setSymbole(char symbole) {
        Symbole = symbole;
    }
}
