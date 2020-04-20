import java.util.Scanner;

public class Custom154 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number : ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int multiplied = number * 89 / 10;
        System.out.println("Lucky Number : " + multiplied);

    }
}
