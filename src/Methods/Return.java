package Methods;

public class Return {
    public static void main(String[] args){

        int x = 3;
        int y = 4;
        int z = add(x,y);
        System.out.println(z);
    }

    static int add(int x, int y){
    // don't put void in a return type method because void is used for methods that don't return any value
        int z = x + y;
        return z;
        // you can also use return x + y; to shorten the code
        // and for the output System.out.println(add(x,y));


    }
}
