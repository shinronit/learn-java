import java.util.Arrays;
import java.util.Scanner;

public class Custom99 {
    public static void main (String [] args) {
        System.out.println("Enter animal name to add");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < 10;i++) {
            String input = scanner.nextLine();
            String[] zooAnimals = {"Lion" , "Elephant" , "Rhino, " + input};
            if (zooAnimals.length < 1) {
                System.out.println("Very low animals in the zoo");
            } else {
                System.out.println(Arrays.toString(zooAnimals));
            }
        }
    }
}
