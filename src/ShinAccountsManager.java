//java files getMd5.java
//cjAccountRead.java
//modifyCJData
//shincochan@@
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class ShinAccountsManager {
    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner scanner = new Scanner(System.in);
        cjShinLoginPage cjShinLoginPage = new cjShinLoginPage();
        System.out.println("For any issues please contact the help-line number.");
        System.out.println("Enter Account ID or username");
        String accountInfo = scanner.nextLine();
        if (accountInfo.equalsIgnoreCase("cj")||accountInfo.equalsIgnoreCase("51112")){
            cjShinLoginPage.loginpage();
        }else {
            System.out.println("Id didn't matched our records plesae try again with a correct id ");
            System.exit(0);
        }
    }
}