import java.util.Scanner;

public class Custom69 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i = Integer.parseInt(input);
        for ( int j = 1; j < 10; j++ ) {
            if (i == 1) {
                System.out.println("Hello World");
            }
        }
    }
}
