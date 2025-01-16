public class Logical_Operators_AND {

    public static void main(String[] args){

        int temperature =25;

        if(temperature>30){
            System.out.println("It is hot outside");
        }
        else if(temperature>=20 && temperature<=30){
            System.out.println("It is warm outside");
        }
        else{
            System.out.println("It is cold outside");
        }

    }
}
//Logical operators = used to connect 2 or more expressions
// && = (AND) both conditions must be true
// ||= (OR) only condition must be true
// ^^ = (XOR) 2 conditions must be sae to be true/
// ! = (NOT) reverses boolean value of a condition
