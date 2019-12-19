import java.util.Scanner;
import java.util.Random;

public class Custom16 {
    public static void main(String[] args) {
        System.out.println("Use 1,2,3 keys for playing");
        System.out.println("If you hit score 1000 you are so lucky");
        System.out.println(" Play 10 times to calculate ");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        for ( int counter = 1;counter <= 10;counter += 1 ) {

            int oneNumber = random.nextInt(200);
            int twoNumber = random.nextInt(110);
            int thirdNumber = random.nextInt(100);

            String input = scanner.nextLine();
            if (input.equals("1")){
                System.out.println("You Score " + oneNumber);
                total += oneNumber;
            } else if (input.equals("2")){
                System.out.println("You Score " + twoNumber);
                total += twoNumber;
            } else if (input.equals("3")){
                System.out.println("You Score " + thirdNumber);
                total += thirdNumber;
            } else {
                System.out.println("please select a valid number");
            }
        }

        System.out.println();
        System.out.println("Total score " + total);

        if (total > 1000){
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOOSE");
        }
    }
}
