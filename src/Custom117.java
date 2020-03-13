import java.util.Random;
import java.util.Scanner;

public class Custom117 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a answer");
        String input = scanner.nextLine();
        if (input.length() < 10){
            System.exit(0);
        }
        Random random = new Random();
        int number = random.nextInt(100);
        boolean randomNumberCheck = (number <50 ? true : false);
        System.out.println(randomNumberCheck);
    }
}















