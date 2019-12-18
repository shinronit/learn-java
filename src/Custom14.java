import java.util.Scanner;

public class Custom14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number (only numbers allowed).");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number (only numbers allowed).");
        int num2 = scanner.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
        System.out.println("Is answer correct (yes or no).");
        Scanner scanner1 = new Scanner(System.in);
        String answer = scanner1.nextLine();

        if (answer.equals("yes")){
            System.out.println("I know that i was only testing you.");
        }else if (answer.equals("no")){
            System.out.println("Go study and stop using these programs for cheating.");
        }else{
            System.out.println("Error you didn't wrote yes or no.");
            System.exit(0);
        }
    }
}