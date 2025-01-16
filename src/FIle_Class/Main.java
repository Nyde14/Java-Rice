package FIle_Class;

import java.io.File;

public class Main {
    public static void main(String[] args){

        File file = new File("meow.txt");

        if(file.exists()){
            System.out.println("This file exists. :O");
            //file.getPath - gets the file path of a file
            System.out.println(file.getAbsolutePath());
            //there are more methods that you can use 
        }
        else{
            System.out.println("file does not exist :(");
        }
    }
}
