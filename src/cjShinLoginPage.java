package ciAccountFiles;

import ciAccountFiles.cjAccountOpenMain;

import java.util.Scanner;

public class cjShinLoginPage {
    public void loginpage() {
        cjAccountOpenMain cjAccountOpenMain = new cjAccountOpenMain();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pass : ");
        String pass = scanner.nextLine();
        if (pass.equals("cj@shincochan")) {
            cjAccountOpenMain.openCjAccount();
        }else {
            System.out.println("Wrong pass please try again with a valid pass");
            System.exit(0);
        }
    }
}
