package ma.jerroudi.cheesegame.pawns;
import ma.jerroudi.cheesegame.bouard.BoardAbstract;
import ma.jerroudi.cheesegame.bouard.Case;
import ma.jerroudi.cheesegame.bouard.PieceEnum;

public class Bishop extends Piece {
    public Bishop(PieceEnum pieceEnum) {
        super(pieceEnum);
    }




    @Override
    public boolean couldMove(BoardAbstract board, Case caseStart, Case caseEnd) {
        if (caseStart.isCaseEmpty()) {
            System.out.println("error case is empty");
            return false;
        }

        if ( caseStart.getPiece().isTheSameTeretory(caseEnd.getPiece()) ) {
            return false;
        }

        int x = Math.abs(caseStart.getX() - caseEnd.getX());
        int y = Math.abs(caseStart.getY() - caseEnd.getY());

        if (x != y) {

            return false;
        }
    /*else if ( caseEnd.getX()< caseStart.getX()&& caseEnd.getY()<caseStart.getY()){
        for (int i =1 ; i<caseEnd.getX() || i<caseEnd.getY();i++){
            if( board.getCase(caseEnd.getX()+i,caseEnd.getY()+i).getPiece()!=null){
                return false ;
            }
        }
    }
*/
        // TODO verify all cases should be empty
        return true ;
    }



}
