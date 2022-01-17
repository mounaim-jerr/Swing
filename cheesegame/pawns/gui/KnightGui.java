package ma.jerroudi.cheesegame.pawns.gui;
import ma.jerroudi.cheesegame.bouard.BoardAbstract;
import ma.jerroudi.cheesegame.bouard.Case;
import ma.jerroudi.cheesegame.bouard.PieceEnum;

public class KnightGui extends PieceGui {
    public KnightGui(PieceEnum pieceEnum) {
        super(pieceEnum);
    }


    @Override
    public boolean couldMove(BoardAbstract board, Case caseStart, Case caseEnd) {
        if (caseStart.isCaseEmpty() ){
            return false;
        }
        if ( caseStart.getPiece().isTheSameTeretory(caseEnd.getPiece())){
            return false ;
        }
        int x= Math.abs(caseStart.getX() - caseEnd.getX())  ;
        int y= Math.abs(caseStart.getY() - caseEnd.getY())  ;

        if (y*x!=2)
        {
            return false;
        }
        return true;
    }
}
