import java.util.Scanner;
import java.util.Random;

public class Custom70 {
    public static void main (String [] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int cash = 100;
        System.out.println("Please select between 1 and 2");
        for ( int i = 1;i < 10;i++ ) {
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("Loose");
                cash -= 10;
                System.out.println("Your Money Left : " + cash);
            } else if (input.equals("2")) {
                System.out.println("Loose");
                cash -= 10;
                System.out.println("Your Money Left : " + cash);
            } else {
                System.out.println("We do not accept " + input);
            }
        }
    }
}

















