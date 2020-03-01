import java.util.Random;
import java.util.Scanner;

public class Custom110 {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        Random random = new Random(0);
        Wallet wallet = new Wallet(500);
        StartGame(scanner,wallet);
    }
    public static void StartGame(Scanner scanner,Wallet wallet){
        System.out.println("Welcome to this game.");
        System.out.println("Press 1 to start game");
        System.out.println("Press 2 to show options of this game");
        System.out.println("Press 3 to quit game");
        String input = scanner.nextLine();
        if (input.equals("1")){
            inGamelevel1(scanner, wallet);
        }else if (input.equals("2")){
            System.out.println("Press E to interact");
            System.out.println("Press Y to jump");
            System.out.println("Press A to go left");
            System.out.println("Press D to go right");
        }else if (input.equals("3")){
            System.exit(0);
    }
    }
    public static void inGamelevel1(Scanner scanner, Wallet custom110) {
        System.out.println("You are a poor fisherman, who have a wife and three children in his family. You use to cast your net in seawater to catch fish for your livelihood. You had made a rule to cast your net only four times a day and never exceeded the set limit.");
        System.out.println("Press enter to continue");
        String InGameinput = scanner.nextLine();
        if (InGameinput.equals("")){

        }else {
            System.exit(0);
        }
        System.out.println("1) Catch fishes");
        System.out.println("2) GoHome with some fishes");
        InGameinput = scanner.nextLine();
        if (InGameinput.equals("1")){
            System.out.println("You died while catching fishes");
            System.exit(0);
        }else if (InGameinput.equals("2")){
            System.out.println("It's dinner time what should I Cook");
            System.out.println("1)The fishes that I caught today");
            System.out.println("1)Should go to a hotel.  Current Money : " + custom110.money);
        }else{

        }
    }
}

class Wallet {
    int money;

    public Wallet(int money) {
        this.money = money;
    }

}
