import java.util.Scanner;

public class Custom136 {
    public static void main (String[] args) {
        System.out.println("Welcome to the terminal ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Enter username of the account");
        String userName = scanner.nextLine();
        if (userName.equals("cj@gmail.com")){
        }else {
            System.out.println("Cannot use this username");
            System.exit(0);
        }
        System.out.println("Enter password");
        String password = scanner.nextLine();
        if (password.equals("ShincoChan@MemberLoginCJ")){
        }else {
            System.out.println("Wrong password");
            System.exit(0);
        }
        System.out.println("Your account status : activated ");
        System.out.println("Validity time : Depends on shin");
    }
}
