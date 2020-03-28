import java.util.Random;
import java.util.Scanner;

public class Custom132 {
    public static void main (String[] args) {
        try {
            String gameID = "CJ";
            System.out.println("Hi "+gameID+" if you want to change your game id mail us on our support with a new name else type 1 to continue");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("1")) {
                //methodname;
                Random random = new Random();
                int x = gameOne(random , scanner , 0);
                System.out.println("Money "+ x);
            } else {
                System.out.println("Closing the app in 2 seconds");
                System.exit(0);
            }
        }catch (Exception e ) {
            System.out.println("There is an eror please restart the app");
            System.exit(0);
        }
    }
    private static int gameOne(Random random,Scanner scanner,int money) {
        System.out.println("Get Rs 10 for each correct guess");
        System.out.println("you can play unlimited times if you want to stop write stop and hit enter.");
        for(int i = 1;i<2;) {
            try {
                System.out.println("Choose a number between 1 to 10");
                int randomNumber = random.nextInt(10);
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("Stop")) {
                    i = 3;
                    return money;
                }
                int inp = Integer.parseInt(input);
                if (inp == randomNumber) {
                    System.out.println("Woo you got it right ");
                    money += 10;
                    System.out.println("Current money + "+money);
                } else {
                    System.out.println("Oops the number was "+randomNumber);
                }
            }catch (Exception e){
                System.out.println("There is an error please restart the app");
                System.exit(0);
            }
        }
        return money;
    }
}
