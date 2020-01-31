import java.util.Scanner;
import java.util.Random;

public class Custom67 {
    public static void main (String [] args){
        int accountBalance = 250000;
        Random random = new Random();
        System.out.println("Do you want to buy a Iphone");
        System.out.println("Press 1 to exit");
        System.out.println("Press 2 to Continue");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("1")) {
            System.out.println("Exiting Program");
        }else if (input.equals("2")){
            System.out.println("Iphone 7,8,10 Which one?");
            System.out.println("Current Balance : " + accountBalance);
        }else{
            System.out.println("cannot use this as a input please try again");
            System.exit(0);
        }
        String input2 = scanner.nextLine();
        int  a = Integer.parseInt(input2);
        if (a==7){
            System.out.println("Please pay 70000");
            System.out.println("Please write otp");
            int otp = 1000 + random.nextInt(8888);
            System.out.println("Your OTP : " + otp);
            String input3 = scanner.nextLine();
            int  otp1 = Integer.parseInt(input3);
            if (otp==otp1){
                System.out.println("Purchased");
                accountBalance -= 70000;
                System.out.println("Current balance : "+ accountBalance);
            }else{
                System.out.println("Cannot buy wrong otp or network busy");
            }
        }else if (a==8){
            System.out.println("Please pay 85000");
            System.out.println("Please write otp");
            int otp = 1000 + random.nextInt(8888);
            System.out.println("Your OTP : " + otp);
            String input3 = scanner.nextLine();
            int  otp1 = Integer.parseInt(input3);
            if (otp==otp1){
                System.out.println("Purchased");
                accountBalance -= 85000;
                System.out.println("Current balance : "+ accountBalance);
            }else{
                System.out.println("Cannot buy wrong otp or network busy");
            }
        }else if (a==10){
            System.out.println("Please pay 125000");
            System.out.println("Please write otp");
            int otp = 1000 + random.nextInt(9000);
            System.out.println("Your OTP : " + otp);
            String input3 = scanner.nextLine();
            int  otp1 = Integer.parseInt(input3);
            if (otp==otp1){
                System.out.println("Purchased");
                accountBalance -= 125000;
                System.out.println("Current balance : "+ accountBalance);
            }else{
                System.out.println("Cannot buy wrong otp or network busy");
            }
        }
    }
}










