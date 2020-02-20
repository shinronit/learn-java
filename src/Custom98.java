import java.util.Scanner;
import java.util.Random;

public class Custom98 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        try {
            System.out.println("Enter Number 1");
            String num1 = scanner.nextLine();
            if (num1.equals("quit")){
                System.exit(0);
            }
            int a = Integer.parseInt(num1);
            System.out.println("Enter Number 2");
            String num2 = scanner.nextLine();
            int b = Integer.parseInt(num2);
            System.out.println("Select opreator");
            String opreator = scanner.nextLine();
            switch (opreator) {
                case "+": {
                    int answer = a + b;
                    System.out.println("Answer : " + answer);
                    break;
                }
                case "-": {
                    int answer = a - b;
                    System.out.println("Answer : " + answer);
                    break;
                }
                case "*": {
                    int answer = a * b;
                    System.out.println("Answer : " + answer);
                    break;
                }
                case "/": {
                    int answer = a / b;
                    System.out.println("Answer : " + answer);
                    break;
                }
                default:
                    System.out.println("Not a valid opreator");
                    System.exit(0);
            }
        }catch(Exception e){
            System.out.println("Error subtracting your equation");
            System.exit(0);
        }
    }
}
