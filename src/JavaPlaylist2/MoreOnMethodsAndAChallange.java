package JavaPlaylist2;

public class MoreOnMethodsAndAChallange {
    public static void main (String[] args) {

        int highscore = calculateScore(true , 800 , 5 , 100);
        System.out.println("Your final score is " + highscore);

        highscore = calculateScore(true , 10000 , 8 , 200);
        System.out.println("Your final score is " + highscore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("ronit",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("aban",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("na",highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("cuckoo",highScorePosition);
    }
    public static void displayHighScorePosition(String playname, int highScorePosition){
        System.out.println(playname + " managed to get into position " + highScorePosition + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore>=1000){
            return 1;
        }else if (playerScore>=500&&playerScore<1000){
            return 2;
        }else if (playerScore>=100&& playerScore < 500){
            return 3;
        }else {
            return 4;
        }
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
