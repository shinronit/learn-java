import java.util.Scanner;

public class Custom51 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int humans = 512202;
        System.out.println("Enter number of people in your house.");
        String input = scanner.nextLine();
        int i = Integer.parseInt(input);

        humans += i;
        System.out.println("Current area population " + humans);
    }
}
