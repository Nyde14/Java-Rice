package toString;

public class Main {
    public static void main(String[] args) {
    //toString - returns a string that textually represents an object textually
        //this is used to print strings without typing multiple print statements
        // When printing with this method it displays the address of the object in your computer's RAM/memory
        // to print the string itself you must override the other class

        Cat cat = new Cat();

        System.out.println(cat.toString());


    }
}

