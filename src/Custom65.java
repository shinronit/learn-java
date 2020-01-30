import java.util.Scanner;
import java.util.Random;

public class Custom65 {
    public static void main (String [] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int money = random.nextInt(3000);
        int money1 = random.nextInt(3000);
        int creditcard = money;
        int debitcard = money1;

        System.out.println("Please Enter key code to continue");
        System.out.println("If you dont have key press enter to buy a new one");
        String key = "ABN12-IOM2-01M9-927A";
        String input = scanner.nextLine();

        if (input.equals("ABN12-IOM2-01M9-927A")){
            System.out.println("Welcome Back");
        }else {
            System.out.println("Do you want to but license?   *yes,no*");
            String input1 = scanner.nextLine();
            if(input1.equals("yes")){
                System.out.println("Amount 1000 Rs");
                System.out.println("Use 1 for using Debit Card");
                System.out.println("Use 2 for using Credit Card");
                String input2 = scanner.nextLine();
                if (input2.equals("1")){
                    System.out.println("Debit card current balance " + debitcard);
                    if (debitcard<0){
                        System.out.println("insufficient balance please add money and try again later");
                        System.exit(0);
                    }else{
                        debitcard -= 1000;
                        System.out.println("Credited 1000 from debit card. Current Balance " + debitcard );
                        System.out.println("Your key is ABN12-IOM2-01M9-927A");
                    }
                }else if (input2.equals("2")){
                    System.out.println("Credit card current balance " + creditcard);
                    if (creditcard<0){
                        creditcard -= 1000;
                        System.out.println("Credited 1000 from credit card. Current Balance " + creditcard );
                        System.out.println("Your loan is Rs " + creditcard );
                        System.out.println("Your key is ABN12-IOM2-01M9-927A");
                        System.exit(0);
                    }else{
                        creditcard -= 1000;
                        System.out.println("Credited 1000 from credit card. Current Balance " + creditcard );
                        System.out.println("Your key is ABN12-IOM2-01M9-927A");
                    }
                }else{
                    System.out.println("Cannot take "+ input2 + " " +
                            "as a input cancelling payment please try again later");
                }
            } else if(input1.equals("no")) {
                System.out.println("Ok Exiting Program");
                System.exit(0);
            }else{
                System.out.println("Cannot take "+ input1 + " as a input");
                System.exit(0);
            }
        }
    }
}
