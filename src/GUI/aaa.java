package GUI;

import javax.swing.*;

public class aaa extends Flow_Layout {
    public void run(){
            JFrame frame = new JFrame();
            ImageIcon imame = new ImageIcon("Johnfel.jpg");
            JLabel label = new JLabel();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            label.setIcon(imame);
            label.setBounds(0, 0, 522, 745);
            frame.add(label);

            frame.setSize(522, 745);
            frame.setLayout(null);
            frame.setVisible(true);

    }






    //frame.add(button);
}
