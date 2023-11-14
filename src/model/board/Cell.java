package model.board;

public class Cell {
    public int x;
    public int y;
    public char Symbole;

    @Override
    public String toString() {
        return "Cell{" +
                "Symbole=" + Symbole +
                '}';
    }

    public Cell(int x, int y) {
        this.Symbole = ' ';
        this.x = x;
        this.y = y;

    }

    public char getSymbole() {
        return Symbole;
    }

    public void setSymbole(char symbole) {
        Symbole = symbole;
    }
}

