import java.util.Random;
import java.util.Scanner;

public class Custom130 {
    public static void main (String [] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number I will guess that.");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("")){
            System.out.println("Please choose a valid number");
            System.exit(0);
        }
        try {
            int inp = Integer.parseInt(input);
            int i = inp;
            int l =random.nextInt(1000);
            for(int j = 1;j<100;j++){
                l =random.nextInt(1000);
                System.out.println(l);
            }
            System.out.println("Your number was : "+i);
        }catch (Exception e){
            System.out.println("Please choose a valid number");
        }
    }
}



















