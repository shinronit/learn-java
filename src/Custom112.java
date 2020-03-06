import java.util.Scanner;

public class Custom112 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter num 1");
            String num1 = scanner.nextLine();
            int n1 = Integer.parseInt(num1);
            System.out.println("Enter num 2");
            String num2 = scanner.nextLine();
            int n2 = Integer.parseInt(num2);
            int answer = n2-n1;
            if (n1 > n2) {
                System.out.println("Yes "+n1+" is Greater than "+n2);
            } else {
                System.out.println("NO "+n1+" is not Greater than "+n2);
                System.out.println("ON subtracting "+n1+" from "+n2+" We get "+answer);
            }
        }catch (Exception e){
            System.out.println("Cannot compare with the given number");
        }
    }
}
