import java.util.Scanner;

public class Custom168 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find root of your number.");
        System.out.println("Your Number : ");
        String input = scanner.next();
        int in = Integer.parseInt(input);
        System.out.println("Your square root is : " + Math.sqrt(in));
        System.out.println("Your cube root is : "  + Math.cbrt(in));

    }
}
