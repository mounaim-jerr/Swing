package ma.jerroudi.cheesegame.bouard;

import ma.jerroudi.cheesegame.pawns.Piece;

import java.awt.*;

public class Case {
    private Piece piece;
    private int x;
    private int y;

    public Case(Piece piece, int x, int y) {
        this.setPiece(piece);
        this.setX(x);
        this.setY(y);
    }

    public Case(Piece piece, int x) {
        this.piece = piece;
        this.x = x;
    }

    public String getSymbol() {
        return this.getPiece() == null ? ".." : this.getPiece().getPieceSymbol();
    }

    public String getPiecePhat() {
        return this.getPiece() == null ? null : this.getPiece().getPath();
    }

    public boolean isCaseEmpty() {
        return this.getPiece() == null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
