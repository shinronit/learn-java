import java.util.Scanner;
import java.util.Random;

public class Custom73 {
    public static void main(String[] args) {
        String[] playerInputs = {"head", "tail",};
        Random r=new Random();
        int randomString=r.nextInt(playerInputs.length);
        System.out.println(playerInputs[randomString]);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals(randomString)){
            System.out.println("win");
        }
    }
}
