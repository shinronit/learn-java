import java.util.Scanner;

public class Custom87 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String input = scanner.nextLine();
        String hello = "hello";
        for( i = 0;i < 10;i++ ) {
            System.out.println(hello);
        }
        if (input.equals("hii")) {
            for( int j = 0;j < 10;j++ )
                System.out.println("hii");
        } else {
            System.out.println("cannot take your input");
        }
    }
}
