import java.util.Scanner;

public class Custom53 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think about a number between 2-9");
        String input = scanner.nextLine();
        System.out.println("Mulitply by 2");
        int i=Integer.parseInt(input);
        i*= 2;
        System.out.println(i);
        System.out.println("ADD 5");
        i += 5;
        System.out.println(i);
        System.out.println("Mulitply by 50");
        i*=50;
        System.out.println(i);
        System.out.println("IF your birthday is gone add 1767 else add 1766");
        System.out.println("IF your birthday is gone type 1 else 2");
        String input1 = scanner.nextLine();
        if (input1.equals("1")) {
            i -= 1967;
        } else if (input.equals("2")) {
            i += 1967;
        } else {
            System.out.println("Error null");
        }
        System.out.println("Subtract your birth year now");
        String input3 = scanner.nextLine();
        int o = Integer.parseInt(input3);
        o -= i;
        System.out.println(i);

    }
}
