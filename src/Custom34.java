import java.util.Scanner;
import java.util.Random;

public class Custom34 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int money = 0;

        for (int i = 0; i < 10; i++) {
            int profit = random.nextInt(1000);
            String input = scanner.nextLine();
            int l = Integer.parseInt(input);
            if (l < profit) {
                System.out.println("Loose");
                money -= profit;
                System.out.println("TOTAL MONEY: " + money);
            } else if (l > profit) {
                System.out.println("WIN");
                money += profit;
                System.out.println("TOTAL MONEY: " + money);
            } else {
                System.out.println();
            }
        }
    }
}
