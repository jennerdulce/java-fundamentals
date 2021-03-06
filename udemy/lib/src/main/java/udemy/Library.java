/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package udemy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Library {

    public static void main(String[] args){
        int turtleCount = 0;
        int dogCount = 1;
        int catCount = 2;

        // Pluralize
//        System.out.println(pluralize("turtle", turtleCount));
//        System.out.println(pluralize("dog", dogCount));
//        System.out.println(pluralize("cat", catCount));

        // FlipNHeads
//        System.out.println(flipNheads(10));

        // Timer
        timer();
    }

    public static String pluralize(String animal, int count){
        if(count > 1){
            return "I own " + count + " " + animal + "s.";
        } else if(count == 1){
            return "I own a " + animal + ".";
        }
        return "I do not own a " + animal + ".";
    }

    public static String flipNheads(int headCount){
        Random randomObj = new Random();
        int flips = 0;
        int consecutive = 0;
        while(consecutive != headCount){
            double number = randomObj.nextDouble();
            if(number >= 0.5d){
                System.out.println("Heads");
                consecutive++;
            } else if(number < 0.5d){
                System.out.println("Tails");
                consecutive = 0;
            }
            flips++;
        }
        return "It took " + flips + " to flips " + headCount + " heads in a row.";
    }

    public static void timer(){
        Timer timerObj = new Timer();
        timerObj.schedule(new TimerTask() {
            @Override
            public void run() {
                LocalDateTime datetime = LocalDateTime.now();
                String currentTime = datetime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(currentTime);
            }
        },0, 1000);
    }
}
