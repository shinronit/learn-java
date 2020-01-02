import java.util.Random;

public class Custom25 {
    public static void main (String []args){
        Random random = new Random();
        for (int i = 0 ; i <10; i++){
            int nab = random.nextInt(10);
            if (nab<5){
                System.out.println("yes");
            }else{
                System.out.println("not");
            }
        }
    }
}
