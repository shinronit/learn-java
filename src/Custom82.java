import java.util.Scanner;
import java.util.Random;

public class Custom82 {
    public static void main (String [] args){
        int people = 21;
        for ( int i= 0; i<10; ) {
            try {
                System.out.println("Welcome please enter your detals to join this group");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Name");
                String name = scanner.nextLine();
                System.out.println("Enter Age");
                String age = scanner.nextLine();
                int ag = Integer.parseInt(age);
                if (ag>99){
                    System.exit(0);
                }else if (ag<18){
                    System.exit(0);
                }
                System.out.println("Enter number");
                String mobilenumber = scanner.nextLine();
                if (mobilenumber.length()<10) {
                    System.out.println("This mobile number is not accepted");
                    System.exit(0);
                }else if (mobilenumber.length()>10){
                    System.exit(0);
                }
                System.out.println("Enter email");
                String emailid = scanner.nextLine();
                if (emailid.endsWith("@gmail.com")) {
                } else {
                    System.out.println("This email id is not accepted");
                }
                people += 1;
                System.out.println("Added to group current members : " + people);
                System.out.println("Your details " + name + ", " + ag + ", " + mobilenumber + ", " + emailid);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}