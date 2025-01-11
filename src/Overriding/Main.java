package Overriding;

public class Main {

    public static void main(String[] args){
        // Overriding - Declaring a method in a child class, which is present in the parent class
        // this is done so that a child class can give its own implementation.
        Cat cat = new Cat();
        cat.speak();
        //without overriding the child class will only do what the parent class does
        //by overriding it makes the class do the same thing but in a more specific way

    }
}
