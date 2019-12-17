import java.util.Scanner;
import java.util.Random;

public class Custom12 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner start = new Scanner(System.in);

        System.out.println("If you want a price list for fruits type down anything");
        System.out.println(start.nextLine());

        int randomInteger = random.nextInt(200);
        if (randomInteger > 100)
            System.out.println("Mangoes are selled here for " + randomInteger + " Rs kg");
        else {
            System.out.println("Mangoes are not in stock ");
        }

        int appleRandomInteger = random.nextInt(300);
        if (appleRandomInteger > 200) {
            System.out.println("Apples are selled here for " + appleRandomInteger + " Rs kg");
        } else {
            System.out.println("Apples are not in stock ");
        }

        int grapeRandomInteger = random.nextInt(400);
        if (grapeRandomInteger > 300) {
            System.out.println("Grapes are selled here for " + grapeRandomInteger + " Rs kg");
        } else {
            System.out.println("Grapes are not in stock");
        }

        System.out.println("What do you want to buy");
        Scanner purchase = new Scanner(System.in);
        String buy = purchase.nextLine();
        if (buy.equals("mango") & randomInteger < 100) {
            System.out.println("Not in stock ");
            System.exit(1);
        } else if (buy.equals("mango")) {
            System.out.println("Please pay Rs " + randomInteger + ".00");
            System.exit(1);
        } else if (buy.equals("apple") & appleRandomInteger < 100) {
            System.out.println("Not in stock ");
            System.exit(1);
        } else if (buy.equals("apple")) {
            System.out.println("Please pay Rs " + appleRandomInteger + ".00");
            System.exit(1);
        } else if (buy.equals("grape") & grapeRandomInteger < 100) {
            System.out.println("Not in stock ");
            System.exit(1);
        } else if (buy.equals("grape")) {
            System.out.println("Please pay Rs " + grapeRandomInteger + ".00");
            System.exit(1);
        } else {
            System.out.println("You have to write apple or mango or grape for output");
        }
    }
}
