package Variable_Scopes;

import java.util.Random;

public class Diceroller {
    int number = 0;
    Random random;
    Diceroller(){
        Random random = new Random();

        roll(number, random);
        // these are local variables and cant be used in another method
        // to give roll access to these variables one way is to set arguments and parameters
        //another way is to set it to global by just simply declaring it outside of this method
    }
    void roll(int number, Random random){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}
