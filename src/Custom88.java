import java.util.Random;
import java.util.Scanner;

public class Custom88 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int inputCount = 0;
        System.out.println("A dice is thrown randomly guess the number on the dice");
        String input;
        for(int i = 0;i < 6;i++) {
            int dice = 1 + random.nextInt(6);
            input = scanner.nextLine();
            try {
                int inp = Integer.parseInt(input);
                inputCount += 1;
                if (inp == dice) {
                    System.out.println("WIN");
                    score += 10;
                } else if (inp > 6) {
                    System.out.println("Dice only contains 1 to 6");
                } else if (inp < 0 || inp == 0) {
                    System.out.println("No minus or 0 allowed");
                } else {
                    System.out.println("LOOSE");
                    System.out.println("The number was " + dice);
                }
                if (inputCount == 6) {
                    if (score == 10 || score == 20) {
                        System.out.println("NORMAL VICTORY");
                    } else if (score == 30 || score == 40 || score == 50) {
                        System.out.println("COOL VICTORY");
                    } else if (score == 60) {
                        System.out.println("ULTRA RARE");
                    }
                }
            } catch (Exception e) {
                System.out.println("Program crashed due to input error");
            }
        }
    }
}
