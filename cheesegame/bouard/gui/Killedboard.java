package ma.jerroudi.cheesegame.bouard.gui;

import ma.jerroudi.cheesegame.pawns.*;

public class Killedboard {
    private static final int PAWN_INDEX= 0;
    private static final int BISHOP_INDEX= 1;
    private static final int KNIGHT_INDEX= 2;
    private static final int ROCK_INDEX= 3;
    private static final int QUEEN_INDEX= 4;
    private static final int KING_INDEX= 5;

    protected int tabKillCount[] = new int[12] ;
    public Killedboard() {
    }
    public void insertPiece(Piece piece){

        tabKillCount[piece.getIndex()-1]++;

    }
    public void afichKilledBoard(){
        for (int i =0 ; i<tabKillCount.length;i++){
            System.out.print("index "+i+"  :"+tabKillCount[i]+"   ");
        }
    }
    public int getNbrPiece(int i){
        return tabKillCount[i];
    }

}
