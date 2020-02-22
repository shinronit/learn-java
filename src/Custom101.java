import java.util.Random;
import java.util.Scanner;

public class Custom101 {
    public static void main (String [] args) {
        Custom101 cu = new Custom101();
        int fileNumber = 101;
        if (fileNumber!=101){
            System.exit(0);
        }
        cu.fruitsBuyOne();

    }
    public void fruitsBuyOne(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Choose fruits to buy mango, appple, watermelon");
        System.out.println("Write stop/done to stop adding");
        int mangoPrice = 200;
        int fruitList = 0;
        int fruitPrice = 0;
        int watermelonPrice = 350;
        int applePrice = 545;
        for(` `;;) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("mango")) {
                //mango price for 1 kg = 200;
                fruitList += 1;
                fruitPrice += mangoPrice;
                System.out.println("Items in cart " + fruitList);
                System.out.println("Total amount is : " + fruitPrice);
            } else if (input.equalsIgnoreCase("watermelon")) {
                //watermelon price for 1 kg = 350;
                fruitList += 1;
                fruitPrice += watermelonPrice;
                System.out.println("Items in cart " + fruitList);
                System.out.println("Total amount is : " + fruitPrice);
            } else if (input.equalsIgnoreCase("apple")) {
                //apple price for 1 kg = 545;
                fruitList += 1;
                fruitPrice += applePrice;
                System.out.println("Items in cart " + fruitList);
                System.out.println("Total amount is : " + fruitPrice);
            }else if (input.equalsIgnoreCase("stop")||input.equalsIgnoreCase("quit")||input.equalsIgnoreCase("done")){
                System.out.println("Items in cart " + fruitList);
                System.out.println("Total amount is : " + fruitPrice);
                System.out.println("**************************Please pay via card/paytm******************");
                break;
            }
        }
    }
}
