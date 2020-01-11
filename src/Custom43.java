import java.util.Scanner;

public class Custom43 {
    public static void main (String[] args) {
        int range = 4;
        int userwordsscore = 0;
        System.out.println("Type down anything you want 5 times max");
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0;i < 10;i++ ) {
            String input = scanner.nextLine();
            if (i > range) {
                System.out.println("You have been banned for violating rules");
                break;
            } else {
                userwordsscore += 100;
            }
        }
        System.out.println(userwordsscore);
    }
}