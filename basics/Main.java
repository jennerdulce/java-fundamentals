import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
  public static void main(String[] args) {

    // pluralize
    String sentenceA = pluralize("Cat", 2);
    System.out.println(sentenceA);

    String sentenceB = pluralize("Dog", 1);
    System.out.println(sentenceB);

    String sentenceC = pluralize("Turtle", 0);
    System.out.println(sentenceC);

    // numOfFlips
    // flipNHeads(4);
    flipNHeads(1);

    // clock
    clock();
  }

  public static String pluralize(String word, int num) {
    if (num == 1) {
      return "I own " + num + " " + word + ".";
    } else {
      return "I own " + num + " " + word + "s.";
    }
  }

  public static void flipNHeads(int numOfFlips) {
    Random rand = new Random();
    int flips = 0;
    int consecutive = 0;
    while (consecutive != numOfFlips) {
      double number = rand.nextDouble();
      if (number >= 0.5d) {
        System.out.println("Heads.");
        consecutive++;
        flips++;
      } else if (number < 0.5d) {
        System.out.println("Rails.");
        consecutive = 0;
        flips++;
      }
    }
    System.out.println(("It took " + flips + " to flip " + numOfFlips + " head in a row."));
  }

  public static void clock() {
    Timer everySecond = new Timer();
    everySecond.schedule(new TimerTask() {
      @Override
      public void run(){
        LocalDateTime dateTime = LocalDateTime.now();
        String time = dateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
      }
    }, 0, 1000);
  }
}