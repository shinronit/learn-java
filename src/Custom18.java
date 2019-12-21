import java.util.Scanner;

public class Custom18 {
    public static void main (String[]args){
        System.out.println("WELCOME TO CUSTOM SOFTWARE");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        switch (value){
            case "+":
                int fnum, snum, answer;
                System.out.println("Enter First Number:   ");
                fnum = scanner.nextInt();
                System.out.println("Enter Second Number:   ");
                snum = scanner.nextInt();
                answer = fnum + snum;
                System.out.println(answer);
                System.exit(0);
            case "-":
                System.out.println("Enter First Number:   ");
                fnum = scanner.nextInt();
                System.out.println("Enter Second Number:   ");
                snum = scanner.nextInt();
                answer = fnum - snum;
                System.out.println(answer);
                System.exit(0);
            case "*":
                System.out.println("Enter First Number:   ");
                fnum = scanner.nextInt();
                System.out.println("Enter Second Number:   ");
                snum = scanner.nextInt();
                answer = fnum * snum;
                System.out.println(answer);
                System.exit(0);
            case "/":
                System.out.println("Enter First Number:   ");
                fnum = scanner.nextInt();
                System.out.println("Enter Second Number:   ");
                snum = scanner.nextInt();
                answer = fnum / snum;
                System.out.println(answer);
                System.exit(0);
            case "username":
                System.out.println("Enter your name");
                System.out.println("Hey What can i help You with " + scanner.next() + "?");
                System.exit(0);
            default:
                System.out.println("MAKE SURE TO USE ONLY BUILT IN COMMANDS ONLY");
        }
    }
}
