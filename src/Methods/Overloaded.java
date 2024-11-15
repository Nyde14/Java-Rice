package Methods;

public class Overloaded {

    public static void main(String[] args){

        //Overloaded Methods = methods that have same names but have different parameters
        // it is allowed as long as they have different parameters
        // factors that make parameters different from others = number of parameters, data type, and order

        int x = add(1,2);
        System.out.println(x);
        // by matching the arguments and parameters you can use a different method

    }

    static int add(int a, int b){
        System.out.println("This is an overloaded method 1");
        return a + b;

    }
    static int add(int a, int b, int c){
        System.out.println("This is an overloaded method 2");
        return a + b + c;

    }
}
