package ma.jerroudi.cheesegame.pawns.gui;


import ma.jerroudi.cheesegame.bouard.BoardAbstract;
import ma.jerroudi.cheesegame.bouard.Case;
import ma.jerroudi.cheesegame.bouard.PieceEnum;


public class QueenGui extends PieceGui {
    public QueenGui(PieceEnum pieceEnum) {
        super(pieceEnum);
    }


    @Override
    public boolean couldMove(BoardAbstract board, Case caseStart, Case caseEnd) {
        if (caseStart.isCaseEmpty()){
            return false;
        }
        if (caseStart.getPiece().isTheSameTeretory(caseEnd.getPiece())){
            return false;
        }
        int x= Math.abs(caseStart.getX()- caseEnd.getX());
        int y= Math.abs(caseStart.getY()- caseEnd.getY());
        if (x!=y&&x*y!=0)
        {
            return false;
        }
        return true;
    }
}
