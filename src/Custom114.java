import java.util.Scanner;

public class Custom114 {
    public static void main (String [] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("For submitting your info press 1 for rules type !rules");
        for(int i = 0;i<1;) {
            String input = scanner.nextLine();
            if (input.equals("1")) {
                i = 2;
                userInfo(scanner);
            } else if (input.equals("!rules")) {
                infoRules();
            } else {
                System.out.println("Command not found ");
            }
        }
    }



    public static void userInfo(Scanner scanner){
        String nameField = "";
        String ageField = "";
        String email = "";
        String number = null;
        System.out.print("Enter name : ");
        nameField = scanner.next();
        System.out.print("Enter age : ");
        ageField = scanner.next();
        System.out.print("Email : ");
        email = scanner.next();
        System.out.print("Number : +91 ");
        number = scanner.next();
        if (number.length()!=10){
            System.out.println("Please try again with a valid number");
            System.exit(0);
        }
    }
    public static void infoRules(){
        System.out.println("Please enter valid name else your account will be banned");
        System.out.println("Please enter correct age so we can monitor out servers best for our User");
        System.out.println("Please enter valid email else your account will be banned later");
        System.out.println("Please enter valid number or you will be banned");

    }
}
