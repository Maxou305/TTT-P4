package model.board;

public interface iCell {

    public int x;
    public int y;
    public char Symbole;

    @Override
    public String toString() {
        return "Cell{" +
                "Symbole=" + Symbole +
                '}';
    }

    public iCell(int x, int y) {
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
