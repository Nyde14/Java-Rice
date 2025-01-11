package Constructors;

public class Human {
    String name;
    int age;
    double height;
    Human(String name, int age, double height){

        this.name = name;
        this.age = age;
        this.height = height;
        //"this" - it is used to access the arguments of an object from the main class and use it as the value of
        //the variables of the object

    }
    void eat(){
        System.out.println(this.name + " Is eating.");
    }
    void sleep(){
        System.out.println(this.name + " Is sleeping.");
    }
}
