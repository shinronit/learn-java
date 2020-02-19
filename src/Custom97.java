import java.util.Scanner;
import java.util.Random;


public class Custom97 {
    public static void main (String[] args){
        Random random = new Random();
        int rand = random.nextInt();
        System.out.println(rand);
        if (rand<0){
            System.out.println("Unlucky");
        }else if (rand>0){
            System.out.println("lucky");
        }else{
            System.out.println();
        }

    }
}
