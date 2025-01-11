package Overriding;

public class Cat extends Animal{

    @Override
    // adding "@override" isnt necessary but its a good practice to let others know that its a overriden method.
    void speak() {
        System.out.println("The cat meows.");
    }
}
