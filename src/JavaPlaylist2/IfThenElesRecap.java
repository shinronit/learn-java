package JavaPlaylist2;
import java.util.Random;

public class IfThenElesRecap {
    public static void main (String [] args){
        Random random = new Random();
        int x =random.nextInt(11);
        if(x==1){
            System.out.println("yes it is");
        }else{
            System.out.println(x);
        }
    }
}