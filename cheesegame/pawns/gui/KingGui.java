package ma.jerroudi.cheesegame.pawns.gui;


import ma.jerroudi.cheesegame.bouard.BoardAbstract;
import ma.jerroudi.cheesegame.bouard.Case;
import ma.jerroudi.cheesegame.bouard.PieceEnum;


public class KingGui extends PieceGui {
    public KingGui(PieceEnum pieceEnum) {
        super(pieceEnum);
    }



    @Override
    public boolean couldMove(BoardAbstract board, Case caseStart, Case caseEnd) {
      if (caseStart.isCaseEmpty()){
          System.out.println("error case is empty");
          return false;
      }
        if ( caseStart.getPiece().isTheSameTeretory(caseEnd.getPiece()) ) {
            return false;
        }
        int x= Math.abs(caseStart.getX()- caseEnd.getX());
        int y = Math.abs(caseStart.getY()- caseEnd.getY());
        if ((x!=1||y!=1)&&x+y!=1)
        {
            return false;
        }
        return true;
    }
}
