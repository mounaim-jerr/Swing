package ma.jerroudi.cheesegame.pawns;

import ma.jerroudi.cheesegame.bouard.BoardAbstract;
import ma.jerroudi.cheesegame.bouard.Case;
import ma.jerroudi.cheesegame.bouard.PieceEnum;
import ma.jerroudi.cheesegame.bouard.gui.TeretoryEnum;


public abstract class Piece {
    private PieceEnum pieceEnum;


    public Piece(PieceEnum pieceEnum) {
        this.pieceEnum = pieceEnum;
    }

    public boolean isTheSameTeretory(Piece piece) {
        return piece != null && this.pieceEnum.getTeretory().equals(piece.pieceEnum.getTeretory());
    }


    public String getPieceSymbol() {
        return this.getClass().getSimpleName().substring(0, 2);
    }


    public String getPath() {
        return this.pieceEnum.getPath();
    }
    public int getIndex(){
        return this.pieceEnum.getIndex();
    }
    public TeretoryEnum getTeretory(){
        return this.pieceEnum.getTeretory();
    }

    public abstract boolean couldMove(BoardAbstract board, Case start, Case end);
}
