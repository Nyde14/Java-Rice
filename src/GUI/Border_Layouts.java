package GUI;

import javax.swing.*;
import java.awt.*;

public class Border_Layouts {
    public static void main(String[] args){
        // Layout manager - Defines the natural layout for components within a container

        //Border layout =places components in 5 different areas: NORTH, EAST, WEST, SOUTH and, CENTER

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10, 10 /* adding numbers here sets margins for the layout*/));// sets a  border manager
        frame.setSize(1280,720);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.pink);
        panel5.setBackground(Color.yellow);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));
        // when setting sizes when a panel is located at the sides the height usually is constant and the width is
        // the only one that is usually changed and same for the panels which are located in the top and bottom
        // but the width is constant and the height is usually changed

        frame.add(panel1,BorderLayout.NORTH);// to set the border layout add a comma and the border layout you want ex. BorderLayout.NORTH
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);




    }
}
