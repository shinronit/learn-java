import java.util.Scanner;

public class cjShinLoginPage {
    public void loginpage() {
        cjAccountOpenMain cjAccountOpenMain = new cjAccountOpenMain();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String pass = scanner.next();
        if (pass.equals("cj@shincochan")) {//updateUserPasswordHere
            cjAccountOpenMain.openCjAccount();
        }else {
            System.out.println("Incorrect password , Try again with a valid password");
            System.exit(0);
        }
    }
}
