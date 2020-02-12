import java.util.Scanner;

public class Custom89 {
    public static void main (String [] args){
        Custom89read g = new Custom89read();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email");
        String input = scanner.nextLine();
        if (input.equals("CoBossAdmin@ShinHotel.com")) {
            System.out.println("Enter Password");
            String password = scanner.nextLine();
            if (password.equals("SHINCOCHAN@COBOSS12")) {
                g.openFile();
                g.readFile();
                g.closeFile();
            }else{
                System.out.println("Wrong password");
            }
        }else{
            System.out.println("Wrong email");
        }
    }
}
