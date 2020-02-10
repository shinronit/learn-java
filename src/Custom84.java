import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Custom84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Time : " + dtf.format(now));
        System.out.print("Enter Password to test : ");
        String password = scanner.next();

        int iPasswordScore = 0;

        if( password.length() < 8 ){
            System.out.println("Sir a password contains 8 digits");
            System.exit(0);
        }
        else if( password.length() >= 10 )
            iPasswordScore += 2;
        else
            iPasswordScore += 1;

        if( password.matches("(?=.*[0-9]).*") )
            iPasswordScore += 2;

        if( password.matches("(?=.*[a-z]).*") )
            iPasswordScore += 2;

        if( password.matches("(?=.*[A-Z]).*") )
            iPasswordScore += 2;

        if( password.matches("(?=.*[~!@#$%^&*()_-]).*") )
            iPasswordScore += 2;
        System.out.println("Password Strength : " + iPasswordScore);

        if (iPasswordScore>5){
            System.out.println("Your password is strong");
        }else{
            System.out.println("Your password is weak");
        }
        System.out.println("Password HashCode : " + password.hashCode());
        System.out.println("Password Length : " + password.length());
    }
}