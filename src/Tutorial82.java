import java.util.Scanner;

public class Tutorial82 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        do {
            try {
                System.out.println("Enter first Number:");
                int num1 = scanner.nextInt();
                System.out.println("Enter second Number:");
                int num2 = scanner.nextInt();
                int sum = num1 / num2;
                System.out.println(sum);
                x=2;
            } catch (Exception e) {
                System.out.println("Error cannot divide");
            }
        }while(x==1);
    }
}
