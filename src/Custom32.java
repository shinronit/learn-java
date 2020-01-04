import java.util.Random;
import java.util.Scanner;

public class Custom32 {
    public static void main (String args[]) {
        Random random = new Random();
        int randomInteger = random.nextInt(1000) + 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Your Number");
            System.out.println();
            int playerInput = scanner.nextInt();

            if (playerInput == randomInteger) {
                System.out.println("YOU WIN!!!!!!");
                break;
            } else if (playerInput > randomInteger) {
                System.out.println("Guess Lower");
            } else {
                System.out.println("Guess Higher");
            }
        }
    }
}