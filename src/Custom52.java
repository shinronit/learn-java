import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Custom52 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int radnom2 = random.nextInt(125);
        int score = 0;
        System.out.println("Choose between doors 1 ,2 ,3 for scoring");
        for(int i =0; i<10;i++){
            String input = scanner.nextLine();
            if (input.equals("1")) {
                int random1 = random.nextInt(radnom2);
                score += random1;
            } else if (input.equals("2")) {
                int random1 = random.nextInt(radnom2);
                score += random1;
            } else if (input.equals("3")) {
                int random1 = random.nextInt(radnom2);
                score += random1;
            } else {
                System.out.println("Choose between a number");
            }
            System.out.println("YOUR SCORE : " + score);
        }
        if(score<500){
            System.out.println("You Loose");
        }else{
            System.out.println("You win");
        }
    }
}
