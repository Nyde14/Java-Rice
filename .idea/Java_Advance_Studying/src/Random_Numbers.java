import java.util.Random;

public class Random_Numbers {

    public static void main(String[] args){

        Random random = new Random();
        int x = random.nextInt(6);
        System.out.println(x);

    }
}
// to limit the group of numbers to be chosen put a number where it will be limited to like 6
//then it will only choose numbers between 0-5 not 6 because computers always start with 0
// you can also generate random doubles and booleans
// Abraham Nyde Sioson 11 - ICT Java