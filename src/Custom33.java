import java.util.Random;
import java.util.Scanner;

public class Custom33 {
    public static void main (String []args){
        System.out.println("CHOOSE A NUMBER BETWEEN 1-9. ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();
        int luckyNumber =random.nextInt(9) + 1;
        System.out.println(luckyNumber + " is your lucky number.");
        if (input.equals("1")) {
            System.out.println("LUCKY");
        } else if (input.equals("2")) {
            System.out.println("GOOD");
        } else if (input.equals("3")) {
            System.out.println("HELPER");
        } else if (input.equals("4")) {
            System.out.println("SMART");
        } else if (input.equals("5")) {
            System.out.println("LESS SMART");
        } else if (input.equals("6")) {
            System.out.println("NICE");
        } else if (input.equals("7")) {
            System.out.println("HELPER");
        } else if (input.equals("8")) {
            System.out.println("LUCKY");
        } else if (input.equals("9")) {
            System.out.println("BAD");
        }
    }
}
