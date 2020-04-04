class Input {
    int score;
    String name;

    public Input(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Custom140 {
    public static void main (String[] args) {

        int highscore = calculateScore(true , 800 , 5 , 100);
        System.out.println("Your final score is " + highscore);

        highscore = calculateScore(true , 10000 , 8 , 200);
        System.out.println("Your final score is " + highscore);

        Input[] inputs = new Input[4];
        inputs[0] = new Input("ronit", 1500);
        inputs[1] = new Input("aban", 900);
        inputs[2] = new Input("na", 400);
        inputs[3] = new Input("cuckoo", 50);

        for (int i = 0; i < inputs.length; i++) {
            Input currentInput = inputs[i];
            int highScorePosition = calculateHighScorePosition(currentInput.score);
            displayHighScorePosition(currentInput.name, highScorePosition);
        }
    }
    public static void displayHighScorePosition(String playname, int highScorePosition){
        System.out.println(playname + " managed to get into position " + highScorePosition + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore>=1000){
//            return 1;
//        }else if (playerScore>=500){
//            return 2;
//        }else if (playerScore>=100){
//            return 3;
//        }
//           return 4;
        int position = 4; //assuming position 4 wil be returned
        if (playerScore>=1000){
            position=1;
        }else if (playerScore>=500){
            position=2;
        }else if (playerScore>=100){
            position=3;
        }return position;
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
