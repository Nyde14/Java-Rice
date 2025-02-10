package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Flow_Layout extends JFrame {
    public static void main(String[] args) {
        //Flow layout = another type of layout manager that places components in a row, sized at their preferred size
        // If the horizontal space is too small the flow layout class uses the next available row

        JFrame frame = new JFrame();
        aaa AAA = new aaa();

        ImageIcon image = new ImageIcon("Johnfel.jpg");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
        frame.setSize(500, 500);

        JButton button1 = new JButton("1");
        JButton Secret = new JButton(".");
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == Secret){
                    AAA.run();




                }

            }
        };
        Secret.addActionListener(actionListener);
        frame.add(button1);
        frame.add(Secret);

        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));
        frame.setVisible(true);
    }



    }

