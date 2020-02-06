import java.util.Scanner;
import java.util.Random;

public class Custom80 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Choose a number & write it down here");
        String input = scanner.nextLine();
        int usernumber = Integer.parseInt(input);
        System.out.println("Now multiply it with 4 and divide by 3");
        System.out.println("Now subtract 100 from your number");
        System.out.println("Press enter when you are done");
        input = scanner.nextLine();
        if (input.equals("")){
            System.out.println("Your number : " + usernumber);
        }else{
            System.out.println("not found");
        }
    }
}
