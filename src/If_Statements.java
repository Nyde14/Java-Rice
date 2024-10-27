import java.util.Scanner;
public class If_Statements {

    public static void main(String[] args){

        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        
        if(age>=75){
            System.out.println("Ok Boomer!");

        }
        else if (age>=18) {
            System.out.println("You are an adult!");

        }
        else if (age>=13) {
            System.out.println("You are a teenager");
        }
        else if (age<13) {
            System.out.println("You Want free candy?");
        }


    }
}
//If statements - performs a code if the conditions are true
// else - will be performed if conditions are not true
// Abraham Nyde Sioson 11 - ICT Java