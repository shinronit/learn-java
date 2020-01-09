import java.util.Scanner;
import java.util.Random;

public class Custom40 {
    public static void main (String [] args){
        System.out.println("PROFILE GENERATOR");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter age");
        String age = scanner.nextLine();
        System.out.println("Enter work");
        String work = scanner.nextLine();
        System.out.println("Enter mobnum");
        String mobno = scanner.nextLine();
        System.out.println("Enter today's date");
        String date = scanner.nextLine();
        int digit1 = random.nextInt(2000) + 1000;
        int digit2 = random.nextInt(2000) + 1000;
        int digit3 = random.nextInt(2000) + 1000;
        System.out.print("Your id number is " + digit1 + "." + digit2 + "." + digit3);
    }
}
