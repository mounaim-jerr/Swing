package ma.jerroudi.cheesegame.game;


import ma.jerroudi.cheesegame.bouard.Board;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import java.awt.*;

public class Game {
    private Player playerOne;
    private Player playerTwo;
    private Board table;

    public void gameStart(){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        Container c = frame.getContentPane();
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setSize(500,500);
        panel.setLocation(50,50);
        JLabel labelTitle = new JLabel(" Welcome to chessGame" );
        labelTitle.setForeground(Color.white);
        labelTitle.setFont(new Font("Serif", Font.PLAIN, 20));
        JLabel labelUnderTitle = new JLabel(" by jerroudi" );
        labelUnderTitle.setForeground(Color.white);
        labelUnderTitle.setFont(new Font("Serif", Font.PLAIN, 6));
        frame.getContentPane().add(panel);
        panel.add(labelTitle);
        panel.add(labelUnderTitle);
        JTextArea nameInput1 = new JTextArea("Player one , your name here!",1,1);
        JTextArea nameInput2 = new JTextArea("Player two , your name here!",1,1);






    }
}
