package Constructors;

public class Main {

    public static void main(String[] args){
        // constructors are used to construct same kinds of objects but with different qualities and attributes
        Human human1 = new Human("Meow",16,1.75);
        Human human2 = new Human("Meow2",12,1.20);
        System.out.println(human1.name);
        System.out.println(human2.name);
        human1.eat();
    }
}
