import java.util.Scanner;

public class Custom63 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type pin of card number AX91-2MIN-ASD1");
        int x = 1;
        do {
            try {
                String input = scanner.nextLine();
                int i = Integer.parseInt(input);
                if (i == 1091) {
                    System.out.println("Payment Successfull");
                    x+=2;
                } else {
                    System.out.println("Password did not match please try again later.");
                }
                x=2;
            } catch (Exception e) {
                System.out.println("Error processing pin are you using text?");
                x=1;
            }
        }while(x==1);
    }
}
