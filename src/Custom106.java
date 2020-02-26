import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Custom106 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger("99999999709999999970");

        for(;;){
            System.out.println(bigInteger = bigInteger.add(BigInteger.valueOf(1)));
        }
    }
}
