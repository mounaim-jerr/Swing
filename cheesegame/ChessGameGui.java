package ma.jerroudi.cheesegame;

import ma.jerroudi.cheesegame.bouard.Board;
import ma.jerroudi.cheesegame.bouard.PieceEnum;
import ma.jerroudi.cheesegame.bouard.gui.BoardGui;
import ma.jerroudi.cheesegame.bouard.gui.Killedboard;
import ma.jerroudi.cheesegame.bouard.gui.TeretoryEnum;
import ma.jerroudi.cheesegame.bouard.gui.composent.KilledCase;
import ma.jerroudi.cheesegame.game.Game;
import ma.jerroudi.cheesegame.pawns.Piece;
import ma.jerroudi.cheesegame.pawns.gui.PieceGui;

import static ma.jerroudi.cheesegame.constant.Constants.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChessGameGui extends JFrame {
    Point prevPt;
    Point currentPt;

    public ChessGameGui() {
        Killedboard killedboard = new Killedboard();
        Board boardGui = new BoardGui();
        Game game = new Game();
        game.gameStart();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw(boardGui, killedboard);
        setSize(700, 600);
        setLayout(null);
        this.setUndecorated(true);
        setVisible(true);
        repaint();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent eP) {
                prevPt = eP.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent eR) {
                currentPt = eR.getPoint();
                int oldY = (int) prevPt.getY() / CASE_SIZE;
                int oldX = (int) prevPt.getX() / CASE_SIZE;
                int newY = (int) currentPt.getY() / CASE_SIZE;
                int newX = (int) currentPt.getX() / CASE_SIZE;
                Piece pieceToVer = boardGui.pieceVerification(newY, newX);
                boolean isMove = boardGui.caseChange(oldY, oldX, newY, newX);

                if (!isMove) {
                    boardGui.echecSound();
                    Exeption();
                } else {


                    if (pieceToVer != boardGui.pieceVerification(oldY, oldX)) {
                        killedboard.insertPiece(pieceToVer);
                        killedboard.afichKilledBoard();


                    }
                    boardGui.playSound();
                    draw(boardGui, killedboard);
                }

            }
        });
    }

    private void draw(Board boardGui, Killedboard killedboard) {
        this.getContentPane().removeAll();
        for (int i = 0; i <= Board.MAX_SIZE; i++) {
            for (int j = 0; j <= Board.MAX_SIZE; j++) {
                PieceGui piece = (PieceGui) boardGui.getCase(i, j).getPiece();
                JLabel pieceImage = piece != null ? piece.getImageLabel() : new JLabel();
                pieceImage.setBounds(j * 50, i * 50, 50, 50);
                pieceImage.setBorder(BorderFactory.createLineBorder(Color.green));
                this.getContentPane().add(pieceImage);
                System.out.print(boardGui.getCase(i, j).getSymbol() + " ");
            }
            System.out.println(this.getContentPane().getComponents().length);
        }
        for (int z = 0; z <= KILLEDCASES; z++) {
            KilledCase killedCase = new KilledCase(450, z * 50, this);
            KilledCase killedCase1 = new KilledCase(550, z * 50, this);
            PieceKilledHigh(killedboard, z, killedCase);
            PieceKilledLow(killedboard, z+6, killedCase1);
            this.getContentPane().add(killedCase);
            this.getContentPane().add(killedCase1);

            repaint();
            revalidate();

        }
    }

    private void PieceKilledHigh(Killedboard killedboard, int z,  KilledCase killedCase) {
        int nbrPiece = killedboard.getNbrPiece(z);
        if (nbrPiece > 0) {


            String pathByIndex = PieceEnum.getPathByIndex(z + 1);
            ImageIcon pieceImg = new ImageIcon(new ImageIcon(pathByIndex).getImage().getScaledInstance(CASE_SIZE, CASE_SIZE, Image.SCALE_DEFAULT));


            killedCase.getLabelImg().setIcon(pieceImg);
            killedCase.getLabelCount().setText(nbrPiece + "");


        }
    }

    private void PieceKilledLow(Killedboard killedboard, int z, KilledCase killedCase1) {
        int nbrPiece = killedboard.getNbrPiece(z);
        if (nbrPiece > 0) {


            String pathByIndex = PieceEnum.getPathByIndex(z + 1);
            ImageIcon pieceImg = new ImageIcon(new ImageIcon(pathByIndex).getImage().getScaledInstance(CASE_SIZE, CASE_SIZE, Image.SCALE_DEFAULT));


            killedCase1.getLabelImg().setIcon(pieceImg);
            killedCase1.getLabelCount().setText(nbrPiece + "");

        }
    }


    private void Exeption() {
        JOptionPane.showMessageDialog(this, "you cant move to that case");
    }
}
