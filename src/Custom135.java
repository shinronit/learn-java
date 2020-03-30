import java.util.Random;
import java.util.Scanner;

public class Custom135 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Text Duplicate version 1");
        System.out.println("Enter text you want to duplicate");
        String input = scanner.nextLine();
        System.out.println("Enter number of times you want to duplicate");
        String numberOFTimes = scanner.nextLine();
        int numberofT = Integer.parseInt(numberOFTimes);
        for(int i = 0;i<numberofT;i++){
            System.out.println(input);
        }
    }
}
