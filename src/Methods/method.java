package Methods;

public class method {
    public static void main(String[] args){

        //method = a block of code that is executed when it is called
        //Passing down variables needs to have matching arguments and parameters
        String name = "meow";
        int age = 16;
        hello(name, age);

    }
    //parameters -gives access to a variable from a different method by putting the variable inside the parentheses
    static void hello(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("You are " + age +" years old");
    }
}
