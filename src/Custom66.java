import java.util.Scanner;
import java.util.Random;

public class Custom66 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for ( int i = 0; i < 10; i++ ){
            int randomnumber = random.nextInt(100);
            String input = scanner.nextLine();
            int  a = Integer.parseInt(input);
            if(a<randomnumber){
                System.out.println("Win");
            }else{
                System.out.println("Loose");
            }
        }
    }
}
