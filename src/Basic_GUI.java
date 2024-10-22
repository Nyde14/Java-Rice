import javax.swing.JOptionPane;

public class Basic_GUI {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "you are "+age+" years old ");

        String food = JOptionPane.showInputDialog("What is your favorite food?");
        JOptionPane.showMessageDialog(null, "your favorite food is "+food);
    }
}
// use Integer.parseInt if answers must only be an integer/number
// other data types like float and double must be converted
// Abraham Nyde Sioson 11 - ICT Java