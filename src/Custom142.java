import java.util.Random;
import java.util.Scanner;

class Result {
    int levelInitiated;
    int score;

    Result (int levelInitiated , int score) {
        this.levelInitiated = levelInitiated;
        this.score = score;
    }
}

class Result2 {
    int scoreOfLevel2;

    Result2 (int scoreOfLevel2) {
        this.scoreOfLevel2 = scoreOfLevel2;
    }
}

public class Custom142 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Result res = inGameLevel1(scanner , random);
        Result2 res2 = inGameLevel2(scanner , random);
        int levelInitiated = res.levelInitiated;
        int score = res.score;
        int score2 = res2.scoreOfLevel2;
        int totalScore = score+score2;
        System.out.println("Total Score : "+totalScore);
    }

    public static Result inGameLevel1 (Scanner scanner , Random random) {
        int levelInitiated = 1;
        int score = 567;
        System.out.println("Current level : "+levelInitiated);
        System.out.println("Type rules to know the rules.");
        for(int i = 1;i < 6;i++) {
            System.out.println("Choose your guess.");
            int winNumber = random.nextInt(100);
            String input = scanner.nextLine();
            if (input.equals(">") && winNumber > 50) {
                System.out.println("Oh you got it right!");
                System.out.println("Current chances number : "+i);
                score += 100;
            } else if (input.equals("<") && winNumber < 50) {
                System.out.println("Oh you got it right!");
                System.out.println("Current chances number : "+i);
                score += 100;
            } else if (input.equalsIgnoreCase("rules")) {
                generalRules();
                i -= 1;
            } else {
                System.out.println("Oops try again.");
                System.out.println("Current chances number : "+i);
                score -= 50;
            }
        }
        System.out.println("You Scored "+score);
        if (score > 400 || score == 400) {
            System.out.println("You made it to level 2");
        } else {
            System.out.println("Oops you didn't made it try again...");
        }
        Result res = new Result(levelInitiated , score);
        return res;
    }

    public static Result2 inGameLevel2 (Scanner scanner , Random random) {
        int levelInitiated = 2;
        int scoreOfLevel2 = 0;
        System.out.println("Current level : "+levelInitiated);
        System.out.println("Type rules to know the rules.");
        for(int i = 1;i < 6;i++) {
            System.out.println("Choose your guess.");
            int winNumber = random.nextInt(100);
            String input = scanner.nextLine();
            if (input.equals(">") && winNumber > 50) {
                System.out.println("Oh you got it right!");
                System.out.println("Current chances number : "+i);
                scoreOfLevel2 += 100;
            } else if (input.equals("<") && winNumber < 50) {
                System.out.println("Oh you got it right!");
                System.out.println("Current chances number : "+i);
                scoreOfLevel2 += 100;
            } else if (input.equalsIgnoreCase("rules")) {
                generalRules();
                i -= 1;
            } else {
                System.out.println("Oops try again.");
                System.out.println("Current chances number : "+i);
                scoreOfLevel2 -= 50;
            }
            System.out.println("You Scored "+scoreOfLevel2);
            if (scoreOfLevel2 > 400 || scoreOfLevel2 == 400) {
                System.out.println("You made it");
            } else {
                System.out.println("Oops you didn't made it try again...");
            }
        }
        Result2 res2 = new Result2(scoreOfLevel2);
        return res2;
    }

    public static void generalRules () {
        System.out.println("GENERAL RULES");
        System.out.println("Guess the number is greater or lower than 50 ");
        System.out.println("Use less than and greater than symbols to predict your guess");
        System.out.println("IF You are able to complete score of 400 you can proceed to next level");
    }
}
