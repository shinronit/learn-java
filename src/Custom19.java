import java.util.Scanner;

public class Custom19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO SHIN MAILS ");
        System.out.println("ENTER 1 TO LOG IN TO ACCOUNT");
        System.out.println("ENTER 2 TO CREATE A ACCOUNT");
        String string = scanner.nextLine();
        String name;
        String age;
        String email = ("@shinmails.com");
        String password;

        if (string.equals("1")) {
            System.out.println("ENTER YOUR EMAIL");
            string = scanner.nextLine();
            if (string.equals("guestid1")) {
                System.out.println("ENTER YOUR PASSWORD");
                string = scanner.nextLine();
                if (string.equals("Quantum")) {
                    System.out.println("LOGIN SUCCESSFULL");
                } else {
                    System.out.println("INCORRECT PASSWORD");
                }
            } else {
                System.out.println("NO SUCH ACCOUNT FOUND ON THE SERVER SIDE");
            }

        } else if (string.equals("2")) {
            System.out.println("ENTER YOUR NAME ");
            name = scanner.nextLine();
            System.out.println("ENTER YOUR AGE ");
            age = scanner.nextLine();
            System.out.println("YOUR EMAIL ID IS ");
            System.out.println(name + email);
            System.out.println("CHOOSE A PASSWORD ");
            password = scanner.nextLine();
            System.out.println("name = " + name);
            System.out.println("age = " + age);
            System.out.println("email = "+ name + email);
            System.out.println("THIS IS YOUR ACCOUNT INFO");

            System.out.println("ENTER YOUR EMAIL");
            string = scanner.nextLine();
            if (string.equals(name + email)) {
                System.out.println("ENTER YOUR PASSWORD");
                string = scanner.nextLine();
                if (string.equals(password)) {
                    System.out.println("LOGIN SUCCESSFULL");
                } else {
                    System.out.println("INCORRECT PASSWORD");
                }
            } else {
                System.out.println("NO SUCH ACCOUNT FOUND ON THE SERVER SIDE");
            }
        }
    }
}

