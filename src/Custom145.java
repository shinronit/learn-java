import java.math.BigInteger;
import java.util.Scanner;

public class Custom145{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = userName(scanner);
        System.out.println("Welcome "+s);
        BigInteger a = add(scanner);
    }

    private static BigInteger add(Scanner scanner){
        BigInteger total = new BigInteger("0");
        try{
            System.out.println("This will help you to add 2 numbers");
            System.out.print("Enter number : ");
            String input = scanner.next();
            BigInteger bigInteger = new BigInteger(input);
            System.out.print("Enter number : ");
            String input2 = scanner.next();
            BigInteger bigInteger2 = new BigInteger(input2);
            for (int i = 0;i < 5;i++){
                System.out.println();
            }
            System.out.println("Your first number was "+bigInteger);
            System.out.println("Your second number was "+bigInteger2);
            total = bigInteger.add(bigInteger2);
            System.out.println("On adding your number , I got : "+total);
            getLength(total);
            total = bigInteger.subtract(bigInteger2);
            System.out.println("On substracting your number , I got : "+total);
            getLength(total);
            total = bigInteger.multiply(bigInteger2);
            System.out.println("On multiplying your number , I got : "+total);
            getLength(total);
            String i = String.valueOf(total);
            total = bigInteger.divide(bigInteger2);
            getLength(total);
            System.out.println("On dividing your number , I got : "+total);

        }catch (Exception e){
            System.out.println("There is a problem with the calculation please try again with a different number.");
            return BigInteger.valueOf(- 1);
        }
        return total;
    }

    public static String userName(Scanner scanner){
        System.out.print("Enter username : ");
        String name = scanner.next();
        return name;
    }

    public static void getLength(BigInteger total){
        String i = String.valueOf(total);
        if ( i.length() > 6 ) {
            System.out.println("Length of your number : "+i.length());
        }
    }
}
