public class Switches {

    public static void main(String[] args){

        String day = "Friday";

        switch(day){
            case"Sunday": System.out.println("It is Sunday!");
            break;
            case"Monday": System.out.println("It is Monday!");
                break;
            case"Tuesday": System.out.println("It is Tuesday!");
                break;
            case"Wednesday": System.out.println("It is Wednesday!");
                break;
            case"Thursday": System.out.println("It is Thursday!");
                break;
            case"Friday": System.out.println("It is Friday!");
                break;
            case"Saturday": System.out.println("It is Saturday!");
                break;
            default: System.out.println(day+" is not a day!");
        }

    }
}
// switch - a statement that allows a variable to be tested for equality against a list of values
// - switcher can have a number of possible paths unlike if-then statements
// - it works with byte,short,char, abd int primitive data types
// - it also works with enumerated types, and String
// always add breaks or else if a variable is matched teh variables below it will also be printed
// for example if day = Tuesday it will print "It is Tuesday!" "It is Wednesday!"...
// use default if nothing matches