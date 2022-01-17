package ma.jerroudi.cheesegame.bouard.gui.utils;

import javax.swing.*;
import java.awt.*;

public class ComposentUtils {
    public static JLabel generatLabels(int x, int y, int width, int height) {
        JLabel label = new JLabel();
        label.setBounds(x, y, width, height);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        label.setBackground(Color.BLACK);
        return label;
    }
}


