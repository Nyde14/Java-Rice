package GUI;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame jframe = new JFrame();
        jframe.setTitle("Title");// gives the window a name
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// When you click on X the window closes but the program still runs
        //use this to end the program once the x is clicked
        // you can use "Jframe.DO_NOTHING_ON_CLOSE" to prevent the window from being closed.
        jframe.setSize(800,600);// sets the size of the frame
        jframe.setVisible(true);// makes the frame visible

        ImageIcon image = new ImageIcon("git.png"); // gets an image icon
        jframe.setIconImage(image.getImage());// this one sets the image icon that was gotten by the code above
        //this changes the icon of the window

        jframe.getContentPane().setBackground(Color.BLACK);//changes the bg color
    }
}
