import java.util.Random;
import java.util.Scanner;

public class Custom81 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        System.out.println("Enter Your Name");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);
        for ( int i = 0;i<10;i++ ){
            int r1 = random.nextInt(100);
            int r2 = random.nextInt(100);
            System.out.println("Choose 1 or 2");
            String input = scanner.nextLine();
            if (input.equals("1")){
                if (r1>r2){
                    System.out.println("Win");
                    score += 100;
                }else{
                    System.out.println("loose");
                }
            }else if (input.equals("2")){
                if (r1>r2){
                    System.out.println("Win");
                    score += 100;
                }else{
                    System.out.println("loose");
                }
            }else if (input.equals("RonitDebug101")){
                System.out.println("Set your score manually");
                String debugScore = scanner.nextLine();
                int sc = Integer.parseInt(debugScore);
                score += sc;
            }else{
                System.out.println("Please select a input only");
            }
        }
        System.out.println("Score " +  score);
        if (score >500){
            System.out.println("You have won this game");
        }
    }
}
