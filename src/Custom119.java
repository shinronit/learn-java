import java.util.Random;

public class Custom119 {
    public static void main (String [] args){
        Random random = new Random();
        for(;;) {
            int i = random.nextInt(100000);
            System.out.println(i);
            if (i == 999999){
                System.exit(0);
            }
        }
    }
}
