import java.lang.*;
import java.util.Scanner;

public class Custom77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String input = scanner.nextLine();
            int i = Integer.parseInt(input);
            int rev = 0;
            System.out.println("Real: " + i);
            while (i != 0) {
                int digit = i % 10;
                rev = rev * 10 + digit;
                i /= 10;
            }

            System.out.println("Reversed: " + rev);
        }catch (Exception e){
            System.out.println("Error reversing please try again with a number");
        }
    }
}