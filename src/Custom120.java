import java.util.Scanner;

public class Custom120 {
    public static void main (String [] args){
        Custom120 file = new Custom120();
        Scanner scanner = new Scanner((System.in));
        playerHandler(scanner);
    }

    public static void playerHandler(Scanner scanner){
        System.out.println("Select number of players to add : ");
        String inputNum = scanner.nextLine();
        int p1Score = 0;
        int p2Score = 0;
        int in = Integer.parseInt(inputNum);
        int playerCount = 0;
        for(int i = 0; i<in;i++) {
            System.out.println("Select player name to join : ");
            String input = scanner.nextLine();
            playerCount += 1;
        }
        if (playerCount==1){
            System.out.println("Cannot play with only one player");
            System.exit(0);
        }
        System.out.println("Total Players : " + playerCount);
        System.out.println("Player 1 chance");
        System.out.println("Question 1 Can soap get Dirty?");
        String player1input = scanner.nextLine();
        if (player1input.equalsIgnoreCase("yes")){
            System.out.println("Nice");
            p1Score += 100;
        }else {
            System.out.println("wrong answer");
        }
        System.out.println("Player 2 turn ");
        String player2input = scanner.nextLine();
        if (player2input.equalsIgnoreCase("yes")){
            System.out.println("Nice");
            p2Score += 100;
        }else {
            System.out.println("wrong answer");
        }
        System.out.println("Player 1 chance");
        System.out.println("Question 2 LEGALLY, ARE TOMATOES FRUITS OR VEGETABLES?");
        player1input = scanner.nextLine();
        if (player1input.equalsIgnoreCase("vegetables")){
            System.out.println("Nice");
            p1Score += 100;
        }else {
            System.out.println("wrong answer");
        }
        System.out.println("Player 2 turn ");
        player2input = scanner.nextLine();
        if (player2input.equalsIgnoreCase("vegetables")){
            System.out.println("Nice");
            p2Score += 100;
        }else {
            System.out.println("wrong answer");
        }
        System.out.println("Player 1 total score = " + p1Score);
        System.out.println("Player 1 total score = " + p2Score);
    }

}
