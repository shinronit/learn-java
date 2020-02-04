import java.util.Scanner;
import java.util.Random;

public class Custom75 {
    public static void main (String[] args) {
        System.out.println("Answer 5 times ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int streak = 0;
        try {
            for ( int i = 0;i < 5;i++ ) {
                int random1 = random.nextInt(1000);
                int random2 = random.nextInt(1000);
                System.out.println("What is  " + random1 + (" + ") + random2);
                String input = scanner.nextLine();
                int o = Integer.parseInt(input);
                int answer = random1 += random2;
                if (answer == o) {
                    System.out.println("Correct");
                    score += 200;
                    streak += 1;
                } else {
                    System.out.println("Incorrect");
                    score -= 75;
                    streak -= streak;
                    System.out.println("Answer : " + answer);
                }
            }
        }catch (Exception e){
            System.out.println("Only numbers allowed");
        }
        System.out.println("Streak : " + streak);
        System.out.println("Score : " + score);
        if (score<500){
            System.out.println("You need to study more");
        }else{
            System.out.println("Great Job");
        }
    }
}
