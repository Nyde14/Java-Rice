package Joke_Codes;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ni {
    public static void main (String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("ni.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        System.out.println("Are you white(1) or black(2)?");
        int response = scanner.nextInt();
        if(response == 1){
            System.out.println("You are white");

        }else if(response == 2){
            clip.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
