package Joke_Codes;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Pay_Gorn {
    public static void main(String[] args) throws InputMismatchException{
        a A = new a();



        System.out.println("press 1");
        Scanner scanner = new Scanner(System.in);
        try {
        int response = scanner.nextInt();
        Pay_Gorn run = new Pay_Gorn();




            if (response == 1) {
                A.run();

            } else {
                System.out.println("edi don't");
            }
        }catch(InputMismatchException e){
            System.out.println("edi don't");
        }

    }
}
