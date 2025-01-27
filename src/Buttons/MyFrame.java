package Buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JButton button = new JButton();
    MyFrame(){

        button.setBounds(200, 100, 300 , 100);
        button.addActionListener(this);
        button.setText("Im a button.");// puts a text inside the button
        button.setFocusable(false);// gets rid of the box inside the button
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280, 720);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
    }
    @Override // ovverride method for the action listener for the button's functions
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button);{
            System.out.println("meow");
        }

    }
}
