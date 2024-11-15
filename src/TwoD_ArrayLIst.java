import java.util.ArrayList;

public class TwoD_ArrayLIst {

    public static void main(String []args){

        ArrayList<ArrayList<String>> cats = new ArrayList();

        ArrayList<String> asian_cats = new ArrayList<>();
        asian_cats.add("Bengal");
        asian_cats.add("Siamese");
        asian_cats.add("Persian");

        ArrayList<String> western_cats = new ArrayList<>();
        western_cats.add("Maine_Coon");
        western_cats.add("Shorthair");
        western_cats.add("Ragdoll");

        ArrayList<String> african_cats = new ArrayList<>();
        african_cats.add("Caracal");
        african_cats.add("Serval");
        african_cats.add("Lion");

        cats.add(asian_cats);
        cats.add(western_cats);
        cats.add(african_cats);

        System.out.println(cats);
        // to get a specific array use .get(index)

    }
}
