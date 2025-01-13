package FileWritter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        //file writers must be surrounded by try and catch blocks
        //simply makes files and dont forget to close the writer.
        try {
            FileWriter writer = new FileWriter("meow.txt");
            writer.write("Meow meow moew");
            writer.append("\n\n - Nyde");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
