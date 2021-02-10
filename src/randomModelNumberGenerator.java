import java.util.Random;
import java.util.Scanner;

public class randomModelNumberGenerator {
    static Random r = new Random();
    static String[] keys = {"A", "B", "C", "D", "E", "F", "G", "H,", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "$"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Digits you want for your model");
        String i = "";
        try{
            i = scanner.nextLine();
            int Digit = Integer.parseInt(i);
            GetRandomPassword(Digit);
        } catch ( Exception exceptions ){
            System.out.println("Model number cannot be generated for alphabets and numbers like : " + i);
            System.out.println("Please Make sure your number looks like this : " + r.nextInt(50));
        }
    }

    public static void GetRandomPassword(int Digits) {
        String code = "";
        for ( int b = 0;b < Digits;b++ ) {
            int random = r.nextInt(keys.length);
            code += keys[random];
        }
        System.out.print("Model Number Generated : " + code);
    }
}

















