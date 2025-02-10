package Joke_Codes;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class a {
    public static void run(){
        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("a.png");
        JLabel label = new JLabel();
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setBounds(0, 0, 1280, 720);
        frame.setSize(1280, 720);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

    }
}
