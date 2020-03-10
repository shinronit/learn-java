package JavaPlaylist2;

public class CodeBlockAndTheIfThenElseControlStatements {
    public static void main (String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//        if (score < 5000 && score >1000) {
//            System.out.println("Your score 5000");
//        } else if (score < 1000) {
//            System.out.println("your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
        if (gameOver==true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
//        boolean newgameOver = true;
//        int newscore = 10000;
//        int newlevelCompleted = 8;
//        int newbonus = 200;
//        if (newgameOver==true){
//            int finalScore = newscore + (newlevelCompleted * newbonus);
//            System.out.println("Your final score was " + finalScore);
//        }
        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver==true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
