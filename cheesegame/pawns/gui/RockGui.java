package ma.jerroudi.cheesegame.pawns.gui;



import ma.jerroudi.cheesegame.bouard.BoardAbstract;
import ma.jerroudi.cheesegame.bouard.Case;
import ma.jerroudi.cheesegame.bouard.PieceEnum;

public class RockGui extends PieceGui {
    public RockGui(PieceEnum pieceEnum) {
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
        int x = caseStart.getX() - caseEnd.getX();
        int y = caseStart.getY() - caseEnd.getY();
        if (x*y!=0)
        {
            return false;
        }
        return true;

    }
}
