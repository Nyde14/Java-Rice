import java.util.Scanner;

public class User_Input {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("whats your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("what's your favorite food");
        String food = scanner.nextLine();

        System.out.println("hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("your favorite food is "+food);

    }
}
//Don't forget to put import java.util.Scanner;
//replace nextLine with nextInt if input must only be a number
//put scanner.nextLine(); next line every after int variable to prevent skipping
