import java.util.Scanner;
import java.util.Random;

public class Custom35 {
    public static void main (String[]args){
        Scanner consoleScanner = new Scanner(System.in);
        Random randomNumber = new Random();
        System.out.println("Use 1 , 2 as inputs");
        int die = 0;
        int health = 100;
        int bomb = 30;
        int score = 0;

        System.out.println("WELCOME TO THE GAME");
        for (int i = 0; i <10; i++){
            String input = consoleScanner.nextLine();
            int l = Integer.parseInt(input);
            if (l == 1) {
                int valueOfScoreAddingPerChance = randomNumber.nextInt(150);
                if (valueOfScoreAddingPerChance<40) {
                    System.out.println("OOPS IT HURTS");
                    System.out.print(health -= bomb);
                    System.out.println(" Is your health");
                    if(health<die){
                        System.out.println("YOU DIED");
                        break;
                    }
                }else {
                    System.out.println("LOOKS LIKE I GOT LUCKY");
                    health += 10;
                    score += valueOfScoreAddingPerChance;
                }
            } else if (l == 2) {
                int valueOfScoreAddingPerChance = randomNumber.nextInt(100);
                if (valueOfScoreAddingPerChance<40){
                    System.out.println("OOPS IT HURTS");
                    System.out.print(health -= bomb);
                    System.out.println(" Is your health");
                    if(health<die){
                        System.out.println("YOU DIED");
                        break;
                    }
                }else {
                    System.out.println("LOOKS LIKE I GOT LUCKY");
                    health += 10;
                    score += valueOfScoreAddingPerChance;
                }

            }else {
                System.out.println("You were suppsoed to choose between inputs.");
            }

            System.out.println(score + " Is your score.");
        }
    }
}
