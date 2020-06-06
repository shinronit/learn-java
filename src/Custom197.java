import java.sql.Time;
import java.util.Random;

public class Custom197 {
    public static void main(String[] args){
        String Time [] = {"10" , "11" , "12" , "13" , "14" , "15" , "16" , "17" , "18" , "19" };
        Random random = new Random();
        //GUNFORYOU = GFY
        int gfy = random.nextInt(9);
        if(gfy>=2){
            System.out.println("You should go at  : " + Time[gfy] + "PM");
        }else {
        System.out.println("You should go at  : " + Time[gfy] + "AM");
        }
    }
}
