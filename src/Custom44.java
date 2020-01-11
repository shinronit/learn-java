import java.util.Scanner;

public class Custom44 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I bet 9281049210000112");
        System.out.println("are u ready");
        String firstline = scanner.nextLine();
        if (firstline.equals("ok")) {
            System.out.println("You didn't read the numbers above carefully you missed that there is also a alphabet");
            scanner.nextLine();
            System.out.println("OH did you just tried to find it which was never there");
        }
    }
}