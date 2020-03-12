import java.util.Random;
import java.util.Scanner;

public class Custom116 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Choose mode normal mode from 1, never Win mode from 2");
        String menuInput = scanner.nextLine();
        if (menuInput.equals("1")) {
            normalMode(scanner , random);
        } else if (menuInput.equals("2")) {
            cheatModeNeverWIN(scanner , random);
        }else if (menuInput.equalsIgnoreCase("quit")){
            System.exit(0);
        }

    }

    public static void normalMode (Scanner scanner , Random random) {
        for(;;) {
            int number = random.nextInt(10);
            System.out.println("Guess the number from 0-10");
            String input = scanner.nextLine();
            int playerInput = Integer.parseInt(input);
            if (playerInput > 10) {
                System.out.println("Not a valid number");
                System.exit(0);
            }
            if (playerInput == number) {
                System.out.println("WIN");
            } else {
                System.out.println("Oops you loose the number was : "+number);
            }
        }
    }

    public static void cheatModeNeverWIN (Scanner scanner , Random random) {
        for(;;) {
            try {
                int number = random.nextInt(10);
                System.out.println("Guess the number from 0-10");
                String input = scanner.nextLine();
                int playerInput = Integer.parseInt(input);
                if (playerInput > 10) {
                    System.out.println("Not a valid number");
                    System.exit(0);
                }
                for(int i = 0;i < 1;) {
                    if (playerInput == number) {
                        number = random.nextInt(10);
                    } else {
                        System.out.println("Oops you loose the number was : "+number);
                        i = 2;
                    }
                }
            }catch (Exception e ){
                System.out.println("Not a possible input ");
                System.exit(0);
            }
        }
    }
}















