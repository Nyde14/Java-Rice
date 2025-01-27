package GUI;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUI_And_Labels {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.GREEN);// makes a border
        ImageIcon java = new ImageIcon("java.png");
        label.setIcon(java); // makes an image inside the frame

        label.setText("hello");// set text of a label
        label.setHorizontalTextPosition(JLabel.CENTER); // changes the position of the label
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN);// changes text color
        label.setBackground(Color.black);// sets backgroudn color
        label.setFont(new Font(null, Font.PLAIN, 20));// sets font style and size and can also make text bold and italic
        label.setIconTextGap(10);// sets a gap between the text and the image
        label.setBorder(border);// sets the border
        label.setOpaque(true);// makes background visible

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(100, 50, 350, 350);// sets the position and size of the label
        // the first 2 is for the position and 2nd two is for the size



        frame.setTitle("Title");// gives the window a name
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// When you click on X the window closes but the program still runs
        //use this to end the program once the x is clicked
        // you can use "Jframe.DO_NOTHING_ON_CLOSE" to prevent the window from being closed.
        frame.setSize(800,600);// sets the size of the frame
        frame.setLayout(null);//used to manually set a label's size and position
        frame.setVisible(true);// makes the frame visible
        frame.add(label);//makes the label appear

        ImageIcon image = new ImageIcon("git.png"); // gets an image icon
        frame.setIconImage(image.getImage());// this one sets the image icon that was gotten by the code above
        //this changes the icon of the window

        //frame.getContentPane().setBackground(Color.BLACK);//changes the bg color


    }
}
