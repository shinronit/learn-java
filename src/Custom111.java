import java.util.Scanner;

public class Custom111 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pubg nickname");
        String name = scanner.nextLine();
        boolean isCharId = isCharacterId(name);
        if (!isCharId) {
            System.out.println("Name has been successfully register.. Your name : " + name);
        } else {
            while (isCharacterId(name)) {
                System.out.println("Please enter name not character id");
                name = scanner.nextLine();
            }

            System.out.println("Name has been successfully register.. Your name : " + name);
        }
    }

    // "1234"
    public static boolean isCharacterId(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!Character.isDigit(currentChar)) {
                return false;
            }
        }

        return true;
    }
}
