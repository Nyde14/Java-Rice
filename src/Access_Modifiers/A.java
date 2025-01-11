package Access_Modifiers;

import Access_Modifiers2.*;

public class A extends Asub {

    public static void main(String[] args){
        //4 access modifiers
        // 1. no modifier - a class can only be visible within a package
        // 2. public - can be visible anywhere even outside the package
        // 3. protected - can only be visible inside a package and in its subclass
        // 4.private - only visible to the class
        C c = new C();
        Asub asub = new Asub();
        //System.out.println(c.defaultMessage);
        System.out.println(c.publicMessage);
        //System.out.println(c.protectedMessage);
        // if you try to run this it will give an error since it is protected
        // but if the main method is in the 2nd package it will work
    }


}
