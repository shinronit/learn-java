import java.util.Scanner;
import java.util.Random;

public class Custom15 {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Random discount = new Random();
        Random price = new Random();

        System.out.println("Please write your name so we can generate bill.");

        int amount = price.nextInt(500);
        int less = 10 + discount.nextInt(40);
        System.out.println(name.next()+" your total amount is " + amount + " Rs do you want to use any coupons?");
        System.out.println("SHIN10 ");
        System.out.println("SHIN20");
        System.out.println();
        System.out.println("YES/NO");

        String input = consoleInput.nextLine();
        if (input.equals("YES")){
            System.out.println("Please use your coupon code");
            input = consoleInput.nextLine();
            if (input.equals("SHIN10")){
                System.out.println("Coupon used successfully.");
                System.out.print("Your total amount is Rs");
                System.out.print(amount / 1.1);
            } else if (input.equals("SHIN20")){
                System.out.println("Coupon used successfully.");
                System.out.print("Your total amount is Rs ");
                System.out.print(amount / 1.3);
            } else if (input.equals("CJ")){
                System.out.println("VIP Coupon used successfully.");
                System.out.print("Your total amount is Rs ");
                System.out.println(amount - amount);
                System.out.println("Yeah its a 100% off for you sir.");
            } else {
                System.out.println("Please correctly use your coupon code.");
            }

        } else if (input.equals("NO")){
            System.out.println("Ok then please pay amount " + amount);
        } else {
            System.out.println("Please do not write any word of your own.");
        }
    }
}
