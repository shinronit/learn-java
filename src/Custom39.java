import java.util.Scanner;
import java.util.Random;

public class Custom39 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will help you test your luck. Press anything to continue");
        Random random = new Random();
        int num1 = random.nextInt(100);
        if(num1>50){
            System.out.println("LUCK IS YOUR SIDE");
            System.out.println("LUCKY NUMBER IS " + num1/6);
        }else{
            System.out.println("LUCK IS NOT YOUR SIDE");
        }
    }
}