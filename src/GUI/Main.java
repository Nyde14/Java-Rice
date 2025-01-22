package GUI;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args){
        JFrame jframe = new JFrame();
        JLabel label = new JLabel();
        ImageIcon java = new ImageIcon("java.png");
        label.setIcon(java); // makes an image inside the frame
        jframe.add(label);//makes the label appear
        label.setText("hello");// set text of a label
        label.setHorizontalTextPosition(JLabel.CENTER); // changes the position of the label
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN);// changes text color
        label.setIconTextGap(100);// sets a gap between the text and the image
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        jframe.setTitle("Title");// gives the window a name
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// When you click on X the window closes but the program still runs
        //use this to end the program once the x is clicked
        // you can use "Jframe.DO_NOTHING_ON_CLOSE" to prevent the window from being closed.
        jframe.setSize(800,600);// sets the size of the frame
        jframe.setVisible(true);// makes the frame visible

        ImageIcon image = new ImageIcon("git.png"); // gets an image icon
        jframe.setIconImage(image.getImage());// this one sets the image icon that was gotten by the code above
        //this changes the icon of the window

        //jframe.getContentPane().setBackground(Color.BLACK);//changes the bg color


    }
}
