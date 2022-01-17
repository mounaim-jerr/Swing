package ma.jerroudi.cheesegame.bouard.gui;

import ma.jerroudi.cheesegame.bouard.Board;
import ma.jerroudi.cheesegame.bouard.PieceEnum;
import ma.jerroudi.cheesegame.pawns.gui.*;

public class BoardGui extends Board {
    public BoardGui() {
        super();
        this.initBoard();

    }

    @Override
    public void initBoard() {

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                tab[i][j] = new CaseGui(null, i, j);
            }
        }

        tab[0][0] = new CaseGui(new RockGui(PieceEnum.ROCK_WHITE), 0, 0);
        tab[0][1] = new CaseGui(new KnightGui(PieceEnum.KNIGHT_WHITE), 0, 1);
        tab[0][2] = new CaseGui(new BishopGui(PieceEnum.BISHOP_WHITE), 0, 2);
        tab[0][3] = new CaseGui(new QueenGui(PieceEnum.QUEEN_WHITE), 0, 3);
        tab[0][4] = new CaseGui(new KingGui(PieceEnum.KING_WHITE), 0, 4);
        tab[0][5] = new CaseGui(new BishopGui(PieceEnum.BISHOP_WHITE), 0, 5);
        tab[0][6] = new CaseGui(new KnightGui(PieceEnum.KNIGHT_WHITE), 0, 6);
        tab[0][7] = new CaseGui(new RockGui(PieceEnum.ROCK_WHITE), 0, 7);

        tab[7][0] = new CaseGui(new RockGui(PieceEnum.ROCK_BLACK), 7, 0);
        tab[7][1] = new CaseGui(new KnightGui(PieceEnum.KNIGHT_BLACK), 7, 1);
        tab[7][2] = new CaseGui(new BishopGui(PieceEnum.BISHOP_BLACK), 7, 2);
        tab[7][3] = new CaseGui(new QueenGui(PieceEnum.QUEEN_BLACK), 7, 3);
        tab[7][4] = new CaseGui(new KingGui(PieceEnum.KING_BLACK), 7, 4);
        tab[7][5] = new CaseGui(new BishopGui(PieceEnum.BISHOP_BLACK), 7, 5);
        tab[7][6] = new CaseGui(new KnightGui(PieceEnum.KNIGHT_BLACK), 7, 6);
        tab[7][7] = new CaseGui(new RockGui(PieceEnum.ROCK_BLACK), 7, 7);


        for (int i = 0; i <= MAX_SIZE; i++) {
            tab[1][i] = new CaseGui(new PawnGui(PieceEnum.PAWN_WHITE), 1, i);
        }

        for (int i = 0; i <= MAX_SIZE; i++) {
            tab[6][i] = new CaseGui(new PawnGui(PieceEnum.PAWN_BLACK), 6, i);
        }
    }


}
