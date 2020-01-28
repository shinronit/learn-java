import java.util.Scanner;
import java.util.Random;

public class Custom61 {
    public static void main (String [] args){
        int newcustomer = 1;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String coupan[] = {"AMAZON25" , "AMAZONNEW" , "AMAZONOLD"};
        int x = random.nextInt(10000);
        System.out.println("Welcome to Amazon Mall.");
        System.out.println("Your total amount is " + x);
        System.out.println("Do you want to use any coupon codes ?");
        String input = scanner.nextLine();
        for ( int i = 0; i < 10; i++ ) {
            if (input.equals("yes")) {

            } else if (input.equals("no")) {
                System.out.println("Ok Please Pay the amount" + x);
                System.exit(0);
            } else {
                System.out.println("you need to type yes or no. Please do the billing process again");
                System.exit(0);
            }
            System.out.println("Please enter a valid coupon code");
            input = scanner.nextLine();
            if (input.equals("AMAZON250")) {
                x -= 250;
                System.out.println(x);
                if(x<0){
                    System.out.println("Congrats You can grab that for free");
                }
            } else if (input.equals("AMAZONNEW")) {
                if(newcustomer<5) {
                    x -= 1000;
                    System.out.println(x);
                    newcustomer +=1;
                    if(x<0){
                        System.out.println("Congrats You can grab that for free");
                    }
                }else{
                    System.out.println("You cannot use this code anymore");
                    System.exit(0);
                }
            } else if (input.equals("AMAZONOLD")) {
                x -= 250;
                System.out.println(x);
                if(x<0){
                    System.out.println("Congrats You can grab that for free");
                }
            } else {
                System.out.println("Error could not apply that coupon code");
            }
        }
    }
}
