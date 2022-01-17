package ma.jerroudi.cheesegame.bouard;

public abstract class BoardAbstract {
    public static final int MAX_SIZE = 7;

    protected Case[][] tab = new Case[8][8];

    public abstract void initBoard();

    public Case getCase(int i, int j) {
        return tab[i][j];
    }

}
