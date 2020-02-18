import java.util.Scanner;

public class Custom96 {
    public static void main (String [] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter num 1");
            String input = scanner.nextLine();
            int n = Integer.parseInt(input);
            System.out.println("Enter num 2");
            String input1 = scanner.nextLine();
            int t = Integer.parseInt(input1);
            int answer = n/t;
            System.out.println(answer);
        }catch (NumberFormatException e){
            System.out.println("no alphabets allowed");
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
    }
}
