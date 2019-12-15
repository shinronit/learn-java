import java.util.Scanner;
import java.util.Random;

public class Custom10 {
    public static void main(String [] args) {
        //Starter
        Random random = new Random ();
        System.out.println ("If you want a price list for fruits type down anything");
        Scanner start = new Scanner(System.in);
        System.out.println (start.nextLine());
        for (int mango = 0; mango < 1; mango++) {
            int randomInteger = random.nextInt(200);
            if (mango < 100) {
                System.out.println("Mangoes are selled here for " + randomInteger + " Rs kg");
            }

            for (int apple = 0; apple < 1; apple++) {
                int appleRandomInteger = random.nextInt(300);
                if (apple < 100) {
                    System.out.println("Apples are selled here for " + appleRandomInteger + " Rs kg");
                }

                for (int grape = 0; grape < 1; grape++) {
                    int grapeRandomInteger = random.nextInt(300);
                    if (apple < 100) {
                        System.out.println ("Grapes are selled here for " + grapeRandomInteger + " Rs kg");
                    }
                }
            }
        }

        System.out.println("This was our stock ");
    }
}
