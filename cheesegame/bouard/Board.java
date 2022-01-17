package ma.jerroudi.cheesegame.bouard;

import ma.jerroudi.cheesegame.pawns.*;
import ma.jerroudi.cheesegame.pawns.gui.PieceGui;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static ma.jerroudi.cheesegame.constant.Constants.CASE_SIZE;

public class Board extends BoardAbstract {

    public Board() {
        super();
        this.initBoard();
    }

    public void displayBoard() {
        for (int i = 0; i <= MAX_SIZE; i++) {
            for (int j = 0; j <= MAX_SIZE; j++) {
                System.out.print(tab[i][j].getSymbol() + " ");

            }
            System.out.println();
        }
    }

    // TODO should throw exeption
    public boolean caseChange(int i, int j, int newI, int newJ) {


        if ((i < 0 || i > MAX_SIZE) || (j > MAX_SIZE || j < 0) ||
                (newI < 0 || newI > MAX_SIZE) || (newJ > MAX_SIZE || newJ < 0)) {
            System.out.println("exeption error out of memory");
        }
        boolean could = tab[i][j].getPiece().couldMove(this, tab[i][j], tab[newI][newJ]);

        if (could) {

            tab[newI][newJ].setPiece(tab[i][j].getPiece());
            tab[i][j].setPiece(null);
        }
        return could;
    }

    public void playSound(){
        File sound = new File("src/main/java/ma/jerroudi/cheesegame/sounds/playerPlay.wav");
        Clip c = null;
        try {
            c = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        try {
            c.open(AudioSystem.getAudioInputStream(sound));
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        c.start();
    }
    public void echecSound(){
        File sound = new File("src/main/java/ma/jerroudi/cheesegame/sounds/echecPlay.wav");
        Clip c = null;
        try {
            c = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        try {
            c.open(AudioSystem.getAudioInputStream(sound));
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        c.start();
    }
public Piece pieceVerification(int newI, int newJ){
        return tab[newI][newJ].getPiece();
}


    @Override
    public void initBoard() {
        System.out.println("je suis la");
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                tab[i][j] = new Case(null, i, j);
            }
        }

        tab[0][0] = new Case(new Rock(PieceEnum.ROCK_WHITE), 0, 0);
        tab[0][1] = new Case(new Knight(PieceEnum.KNIGHT_WHITE), 0, 1);
        tab[0][2] = new Case(new Bishop(PieceEnum.BISHOP_WHITE), 0, 2);
        tab[0][3] = new Case(new Queen(PieceEnum.QUEEN_WHITE), 0, 3);
        tab[0][4] = new Case(new King(PieceEnum.KING_WHITE), 0, 4);
        tab[0][5] = new Case(new Bishop(PieceEnum.BISHOP_WHITE), 0, 5);
        tab[0][6] = new Case(new Knight(PieceEnum.KNIGHT_WHITE), 0, 6);
        tab[0][7] = new Case(new Rock(PieceEnum.ROCK_WHITE), 0, 7);

        tab[7][0] = new Case(new Rock(PieceEnum.ROCK_BLACK), 7, 0);
        tab[7][1] = new Case(new Knight(PieceEnum.KNIGHT_BLACK), 7, 1);
        tab[7][2] = new Case(new Bishop(PieceEnum.BISHOP_BLACK), 7, 2);
        tab[7][3] = new Case(new Queen(PieceEnum.QUEEN_BLACK), 7, 3);
        tab[7][4] = new Case(new King(PieceEnum.KING_BLACK), 7, 4);
        tab[7][5] = new Case(new Bishop(PieceEnum.BISHOP_BLACK), 7, 5);
        tab[7][6] = new Case(new Knight(PieceEnum.KNIGHT_BLACK), 7, 6);
        tab[7][7] = new Case(new Rock(PieceEnum.ROCK_BLACK), 7, 7);

        for (int i = 0; i <= MAX_SIZE; i++) {
            tab[1][i] = new Case(new Pawn(PieceEnum.PAWN_WHITE), 1, i);
        }

        for (int i = 0; i <= MAX_SIZE; i++) {
            tab[6][i] = new Case(new Pawn(PieceEnum.PAWN_BLACK), 6, i);
        }
    }



}
