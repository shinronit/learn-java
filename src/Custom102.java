import java.util.Scanner;

public class Custom102 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pubg id name please do not use character id");
        try {
            String nameInput = scanner.nextLine();
            int i = Integer.parseInt(nameInput);
            if (nameInput.length()>10){
                System.exit(0);
            }
            System.out.println("Make sure not to use your character id");
        }catch (Exception e){
            System.out.println("Done");
        }
    }
}
