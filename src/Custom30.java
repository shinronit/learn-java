import java.util.Scanner;
import java.util.Random;

public class Custom30 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int health = 40;

        System.out.println("Welcome to the game. Enter your name ");
        String name = scanner.nextLine();

        System.out.println("Hey " + name + "! let's fight");
        System.out.println("Choose between three doors if you reach 20 points you win.");
        System.out.println("Use 0 ,1 ,2 as inputs for doors");

        for ( int j = 0;j < 10;j++ ) {
            int door = random.nextInt(3);
            String input = scanner.nextLine();
            int i = Integer.parseInt(input);

            if (door == i) {
                System.out.println("Door unlocked");
                score += 10;
                if (score > 40) {
                    System.out.println("POWER UP UNLOCKED score boosted");
                    score += 30;
                }
            } else if (door != i) {
                System.out.println("You took damage 10");
                health -= 10;
                System.out.println("Your health: " + health);
                if (health < 5) {
                    System.out.println("YOU DIED");
                    System.out.print("YOUR SCORE: " + score);
                    System.exit(0);
                }
            }
        }

        System.out.print("YOUR SCORE: " + score);
    }
}
