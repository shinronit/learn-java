import java.util.Scanner;

public class Custom104 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int currentshops = 10;
        int shopsavailable = 90;
        int totalshops = 100;
        int clients = 8;
        if (currentshops<100){
            System.out.println("Do you want to buy a shop");
            String shopPopup = scanner.nextLine();
            if (shopPopup.equalsIgnoreCase("yes")){
                System.out.println("Shops available " + shopsavailable);
            }else {
                System.exit(0);
            }
        }
    }
}
