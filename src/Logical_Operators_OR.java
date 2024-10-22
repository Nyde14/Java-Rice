import java.util.Scanner;

public class Logical_Operators_OR {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game.");
        }
        else {
            System.out.println("You are still playing the game");
        }



    }
}
//Logical operators = used to connect 2 or more expressions
// && = (AND) both conditions must be true
// ||= (OR) either condition must be true
// ! = (NOT) reverses boolean value of a condition
// Abraham Nyde Sioson 11 - ICT Java