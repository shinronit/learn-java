import java.util.Scanner;
import java.util.Random;

public class Custom12 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner start = new Scanner(System.in);

        System.out.println("If you want a price list for fruits type down anything");
        System.out.println(start.nextLine());

        int mangoPrice = printFruitMenuAndGetPrice(100, "Mangoes", random);
        int applePrice = printFruitMenuAndGetPrice(200, "Apples", random);
        int grapePrice = printFruitMenuAndGetPrice(300, "Grapes", random);

        System.out.println("What do you want to buy?");
        Scanner purchase = new Scanner(System.in);
        String fruitNameToBeBought = purchase.nextLine();
        if (fruitNameToBeBought.equals("mango")) {
            System.out.println("Please pay Rs " + mangoPrice + ".00");
        } else if (fruitNameToBeBought.equals("apple")) {
            System.out.println("Please pay Rs " + applePrice + ".00");
        } else if (fruitNameToBeBought.equals("grape")) {
            System.out.println("Please pay Rs " + grapePrice + ".00");
        } else {
            System.out.println("You have to write apple or mango or grape for output");
        }
    }

    public static int printFruitMenuAndGetPrice(int basePrice, String fruitName, Random random) {
        int randomInteger = basePrice + random.nextInt(100);
        if (randomInteger > basePrice)
            System.out.println(fruitName + " are sold here for " + randomInteger + " Rs kg");
        else {
            System.out.println(fruitName + " are not in stock ");
        }
        return randomInteger;
    }
}
