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
        System.out.println("SHIN-CLAN USER ACCOUNT TERMINAL (V1.7.3)");
        System.out.println("Login/Sign-up , Do you have an account ? Y/N");
        System.out.print("Your Input : ");
        String accountQuestion = scanner.next();
        if(accountQuestion.equalsIgnoreCase("y")){
        }else if(accountQuestion.equalsIgnoreCase("n")){
            System.out.println("Hi , currently we don't allow people to create there account on their own so if you want to create a account please contact the terminal admin.");
            System.exit(0);
        }else {
            System.out.println("Your input : '" + accountQuestion + "' does not seems to match any command.");
            System.out.println("Hii user , you need to type Y if you have an account if you don't have an account press N.");
            System.out.println("Please try again with a valid input.");
            System.exit(0);
        }
        System.out.print("Enter Account ID or username : ");
        String accountInfo = scanner.next();
        if (accountInfo.equalsIgnoreCase("cj")||accountInfo.equalsIgnoreCase("51112")){
            cjShinLoginPage.loginpage();
        }else {
            System.out.println("Id didn't matched our records plesae try again with a correct id ");
            System.out.println("Try resigning or contact admin.");
            System.exit(0);
        }
    }
}