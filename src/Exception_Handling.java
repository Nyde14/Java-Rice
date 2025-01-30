import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {

    public static void main(String[] args){
        //Exception Handling - Handling an unexpected event that can cause your program to stop working
        // if the code causes an exception put it inside a "try" block
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a number to divide.");
            double x = scanner.nextDouble();

            System.out.println("Enter a number to divide by x.");
            double y = scanner.nextDouble();

            double z = x / y;
            System.out.println("Answer: " + z);
        }
        //if an exception is encountered the code inside the catch block will be run.
        // another exception that could be encountered is a mismatch error where a wrong data type is entered
        // in the user input
        catch(ArithmeticException e){
            System.out.println("You cant divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("that isn't a number");

        }
        //you can also type "Exception" only and it will catch all exceptions
        // finally block - will always be executed even with an exception
        finally{
            scanner.close();
        }
    }
}
