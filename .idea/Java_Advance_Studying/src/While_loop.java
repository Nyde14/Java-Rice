import java.util.Scanner;

public class While_loop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Please enter your name");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+name);
        // if you try to skip by pressing enter it will not stop asking for an input

    }
}
//while loop - executes a code continuously as long as the conditions are true
// Abraham Nyde Sioson 11 - ICT Java

