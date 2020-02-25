import java.util.Random;
import java.util.Scanner;

public class Custom105 {
    public static void main (String[] args) {
        Random random = new Random();
        int life = 5;
        int score = 0;
        System.out.println("Type a number any number           health Left " + life);
        Scanner scanner = new Scanner(System.in);
        try {
            for(;;) {
                int i = random.nextInt(100);
                String input = scanner.nextLine();
                int num = Integer.parseInt(input);
                if (life != 0) {
                    if (i < 50) {
                        System.out.println("Win");
                        score += 100;
                    } else {
                        System.out.println("Loose");
                        System.out.println("Life left " + life);
                        life -= 1;
                    }
                } else {
                    System.out.println("You died Score : " + score);
                    System.exit(0);
                }
            }
        }catch (Exception e){
            System.exit(0);
        }
    }
}