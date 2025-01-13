package Dynamic_Polymorphism;
import java.util.Scanner;
public class Main {
    public static void main(String []args){
        //Dynamic polymorphism - having multiple forms AFTER THE PROGRAM IS ALREADY RUNNING

        Scanner scanner = new Scanner(System.in);
        Gender gender = new Gender();
        Male male = new Male();
        Female female = new Female();

        System.out.println("Please Choose your Gender.");
        System.out.println("Type 1 if you're male and 2 if you're female.  ");
        int choice = scanner.nextInt();

        if (choice==1){
            male.choose();
        }
        if (choice==2){
            female.choose();
        }
        else{
            gender.choose();
        }
    }
}
