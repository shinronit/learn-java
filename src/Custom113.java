import java.util.Scanner;

public class Custom113 {
    public static void main (String[] args) {
        System.out.println("Compiler version 1.12");
        for(;;) {
            System.out.println("CONVERT INR TO USD");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            float inr = Float.parseFloat(input);
            float USD = (inr / 74.01f);
            System.out.println(inr+" RS IS "+USD+" USD");
            System.out.println("Enter new number");
        }
    }
}


















