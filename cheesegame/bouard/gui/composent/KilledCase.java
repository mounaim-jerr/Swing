package ma.jerroudi.cheesegame.bouard.gui.composent;

import ma.jerroudi.cheesegame.bouard.gui.utils.ComposentUtils;

import javax.swing.*;
import java.awt.*;

import static ma.jerroudi.cheesegame.constant.Constants.CASE_SIZE;

public class KilledCase extends JPanel {
     JLabel labelImg ;
     JLabel labelCount;

    public KilledCase(int x, int y , JFrame frame) {
        super(null);
        this.setBounds(x,y,100,50);
      //  this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.labelImg = ComposentUtils.generatLabels(0,0,50,50);
        this.add(labelImg);
        this.labelCount = ComposentUtils.generatLabels(50,0,25,50);
        this.add(labelCount);
        //this.repaint();
        //frame.revalidate();
    }


    public JLabel getLabelImg() {
        return labelImg;
    }

    public void setLabelImg(JLabel labelImg) {
        this.labelImg = labelImg;
    }

    public JLabel getLabelCount() {
        return labelCount;
    }

    public void setLabelCount(JLabel labelCount) {
        this.labelCount = labelCount;
    }

}
