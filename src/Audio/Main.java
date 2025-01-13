package Audio;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        //this code will run but not play the sound because after executing it will be terminated when its done
        //to actaully hear the audio you must keep the code runningg like putting a scanner
        Scanner scanner = new Scanner(System.in);
        File file = new File("Do not play.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response ="";



        while(!response.equals("Q")){
            System.out.println("P= play, S = Stop, R = Reset, Q = quit");
            System.out.println("Enter your choice");
            response = scanner.next();
            response = response.toUpperCase();

            switch(response){
                case("P"):clip.start();
                break;
                case("S"):clip.stop();
                break;
                case("R"):clip.setMicrosecondPosition(0);
                    // this method puts back where the time of the sound is and the value used is milliseconds
                break;
                case("Q"):clip.close();
                default:System.out.println("Invalid response");
            }

        }
        //additionally you can use the scanner to give users an option to play  and stop the audio
        System.out.println("Byeeee");


    }

}

