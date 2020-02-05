import java.util.Scanner;
import java.util.Random;

public class Custom78 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int  eggcurry , maggi , choleBhature;
        System.out.println("Select food to buy choleBhature,maggi,eggcurry" );
        eggcurry = 100 + random.nextInt(150);
        maggi = 100 + random.nextInt(300);
        choleBhature = 100 +  random.nextInt(200);
        String input = scanner.nextLine();
        for ( int x =2; x<3; ) {
            if (input.equals("eggcurry")) {
                System.out.println("Price for your selected food is " + eggcurry);
                x=3;
            } else if (input.equals("maggi")) {
                System.out.println("Price for your selected food is " + maggi);
                x=3;
            } else if (input.equals("choleBhature")) {
                System.out.println("Price for your selected food is " + choleBhature);
                x=3;
            } else {
                System.out.println("Dish not found");
                input = scanner.nextLine();
            }
        }
    }
}
