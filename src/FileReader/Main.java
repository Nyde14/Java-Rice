package FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        //file reader - reads the content of files as a stream of characters
        // surround it with try and catch blocks because it is considered as dangerous code


        try {
            FileReader reader = new FileReader("cat.txt");
            int data = reader.read();
            // read() method returns an int value which contains the byte value
            //make a while loop to print each value as characters
            //-1 means that it has no data inside thats why if it isnt equal to -1 then it does have a value
            while(data != -1){
                // add char inside another parantheses to convert int(data) to a char data type
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            System.out.println("a");
        }
    }
}
