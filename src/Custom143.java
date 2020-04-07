import java.math.BigInteger;
import java.util.Scanner;

public class Custom143 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = userName(scanner);
        System.out.println("Welcome " + s);
        BigInteger a = add(scanner);
    }
    private static BigInteger add(Scanner scanner){
        try {
            System.out.println("This will help you to add 2 numbers");
            System.out.print("Enter number : ");
            String input = scanner.next();
            BigInteger bigInteger = new BigInteger(input);
            System.out.print("Enter number : ");
            String input2 = scanner.next();
            BigInteger bigInteger2 = new BigInteger(input2);
            BigInteger total = bigInteger.add(bigInteger2);
            System.out.println("Total : "+total);
            return total;
        }catch (Exception e){
            System.out.println("There is a problem with the calculation please try again with a different number.");
            return BigInteger.valueOf(-1);
        }
    }
    public static String userName(Scanner scanner){
        System.out.print("Enter username : " );
        String name = scanner.next();
        return name;
    }
}













