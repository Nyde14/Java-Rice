package GUI;

import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args){
        //JPanel - a GUI component that functions as a container to hold other components.

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);//sets bg color for the panel
        greenpanel.setBounds(0, 0, 300, 300);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(300, 0, 300, 300);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(0, 300, 1000, 300);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1280,720);
        frame.setVisible(true);
        frame.add(greenpanel);
        frame.add(redpanel);
        frame.add(bluepanel);

    }
}
