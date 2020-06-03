import java.util.Random;

public class Custom194 {
    public static void main(String[] args){
        Random random = new Random();
        int dice = 1+ random.nextInt(6);
        while (dice>6){
            dice = 1+ random.nextInt(6);
        }
        System.out.println("Your number for your next move is : " + dice);
    }
}
