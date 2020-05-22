import java.util.Random;

public class Custom186 {
    public static void main(String[] args){
        Random random = new Random();
        int i = random.nextInt(10);
        if(1!=i){
            System.out.println("Its not 1");
        }else if(i==2){
            System.out.println("Hello");
        }
    }
}
