package Interface;

public class Fish implements Prey,Predator{

    public void flee(){
        System.out.println("the fish swims away from the bigger fish.");

          }

          public void hunt(){
        System.out.println("The fish eats smaller fish.");
          }
}
