import java.util.ArrayList;

public class Array_list {

    public static void main(String[] args){
        //ArrayList - a resizable array
        //Elements can be added or removed after compilation phase
        //Can only store reference data types

        ArrayList<String> cats = new ArrayList<String>();
        cats.add("Shorthair");
        cats.add("Persian");
        cats.add("Siamese");

        cats.set(0,"Bengal");

        for(int i=0; i<cats.size(); i++){
            System.out.println(cats.get(i));

        }
    }
}
/* other methods under array list
.set = replaces a value with a new one
.remove = removes a value from the list
.clear = clears everything from the list (doesn't remove everything from the code it just doesn't
display anything from the list)
 */