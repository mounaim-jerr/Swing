package ma.jerroudi.cheesegame.pawns.gui;

import ma.jerroudi.cheesegame.bouard.BoardAbstract;
import ma.jerroudi.cheesegame.bouard.Case;
import ma.jerroudi.cheesegame.bouard.PieceEnum;
import ma.jerroudi.cheesegame.pawns.Piece;

import javax.swing.*;
import java.awt.*;

import static ma.jerroudi.cheesegame.constant.Constants.CASE_SIZE;

public  class PieceGui extends Piece {
    private JLabel imageLabel ;

    public PieceGui(PieceEnum pieceEnum) {
        super(pieceEnum);
        this.imageLabel= this.buildLabel();
    }

    public JLabel getImageLabel() {
        return imageLabel;
    }
    public JLabel buildLabel( ){
        JLabel label = new JLabel();
        /* int xIndice = j * CASE_SIZE;
        int yIndice = i * CASE_SIZE;
        label.setBounds(50, 50, CASE_SIZE, CASE_SIZE);
        label.setBorder(BorderFactory.createLineBorder(Color.green));
         */
        ImageIcon pieceImg = new ImageIcon(new ImageIcon(getPath()).getImage().getScaledInstance(CASE_SIZE, CASE_SIZE, Image.SCALE_DEFAULT));
        label.setIcon(pieceImg);
        return label;
    }
    public ImageIcon getImagePiece (Piece piece){
        ImageIcon pieceImg =  new ImageIcon(new ImageIcon(piece.getPath()).getImage().getScaledInstance(CASE_SIZE, CASE_SIZE, Image.SCALE_DEFAULT));
        return pieceImg;
    }




    @Override
    public boolean couldMove(BoardAbstract board, Case start, Case end) {
        return false;
    }
}
