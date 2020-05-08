import java.util.Scanner;

public class Custom172 {
    public static void main (String [] args){
        System.out.println("Custom172.main");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coins to mod.");
        String input = scanner.nextLine();
        int coins = Integer.parseInt(input);
        System.out.println("Current coins : " + coins);
    }
}
