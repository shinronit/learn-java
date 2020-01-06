import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class RandomTutorialPractice {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        int tutorial = random.nextInt(55);

        System.out.println("This program will help you to find a random tutorial number that you should practice today");
        System.out.println("Just change the value of random next int");
        System.out.println("IF YOU NEED TO FIND A RANDOM TUTORIAL NUMBER PRESS 1 AND ENTER");
        String input = scanner.nextLine();

        if (input.equals("1")) {
            System.out.println("Processing your request please stand by");
            timer.schedule(new TimerTask() {
                public void run () {
                    System.out.println("You should practice " + tutorial + " number video today");
                }
            } , 5000);

        } else {
            System.out.println("Null reference is set to an instance of an object.Are you missing a correct value?");
        }
    }
}
