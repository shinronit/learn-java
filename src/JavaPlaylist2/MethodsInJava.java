package JavaPlaylist2;

public class MethodsInJava {
    public static void main (String[] args) {

        calculateScore(true , 800 , 5 , 100);

        calculateScore(true , 10000 , 8 , 200);
    }

    public static int calculateScore (boolean gameOver , int score , int levelCompleted , int bonus) {
        if (gameOver == true) {
            int finalScore = score+(levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was "+finalScore);
            return finalScore;
        }else {
            return - 1;
        }
    }
}
