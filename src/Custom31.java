import java.util.Scanner;

public class Custom31 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String code;
        code = scanner.nextLine();
        if (code.equals("CJ")){
            System.out.println("WELCOME Cj");
        }else{
            System.out.println("I don't know u.");
        }
    }
}