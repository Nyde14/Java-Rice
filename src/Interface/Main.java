package Interface;

public class Main {

    public static void main(String[] args){
        // interface - a template that can be applied to a class
        // this is similar to inheritance but this specifies what a class must do
        // unlike inheritance classes can apply for more than 1 interface

        Rabbit rabbit = new Rabbit();
        Lion lion = new Lion();
        Fish fish = new Fish();

        lion.hunt();
        rabbit.flee();
        fish.hunt();
        fish.flee();
    }
}
