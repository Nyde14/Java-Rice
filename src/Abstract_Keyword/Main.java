package Abstract_Keyword;

public class Main {
    public static void main(String[] args){
        //abstract - abstract classes cannot be instantiated but can have a subclass
        // - usually used for parent classes which are too generic
        // this forces users to choose a more specific object
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

    }
}
