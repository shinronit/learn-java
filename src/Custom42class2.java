import java.util.Random;

public class Custom42class2 {
    public void randomnum(){
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println("Random num is " + num);
        if(num>50){
            System.out.println("YOU ARE LUCKY");
        }else{
            System.out.println("YOU ARE UNLUCKY");
        }
    }
}