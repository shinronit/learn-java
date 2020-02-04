import java.util.Random;
import java.util.Scanner;

public class Custom74 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String Player1;
        String Player2;
        int add = 1000;
        System.out.println("Please choose your name.");
        String nameInput = scanner.nextLine();
        if (nameInput.equals("")){
            System.out.println("Name field cannot be empty");
            System.exit(0);
        }
        System.out.println("Choose second player name");
        String nameInput2 = scanner.nextLine();
        if (nameInput2.equals("")){
            System.out.println("Name field cannot be empty");
        }
        System.out.println("Welcome " + nameInput + " (Player 1)");
        System.out.println("Welcome " + nameInput2 + "(Player 2)");

        try {

            System.out.println("Player 1 Turn");
            System.out.println("Choose a number between 10000");
            String input = scanner.nextLine();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            int p1 = Integer.parseInt(input);
            if (p1 > 10000) {
                System.exit(0);
            }
            System.out.println("Player 2 Turn");
            System.out.println("Choose a number between 10000");
            String input2 = scanner.nextLine();

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            int p2 = Integer.parseInt(input2);
            if (p2 > 10000) {
                System.exit(0);
            }

            if (p1==p2){
                System.out.println("draw");
                System.exit(-0);
            }



            if (p1<p2){
                System.out.println(nameInput + " Is the winner ");
            }else{
                System.out.println(nameInput2 + " Is the winner");
            }
        }catch (Exception e ){
            System.out.println("Error please select a number ");
            System.exit(0);
        }
    }
}
