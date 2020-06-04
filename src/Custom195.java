import java.util.Random;

public class Custom195 {
    public static void main(String[] args){
        String guns [] = {"M416" , "AkM" , "AWM" , "SKS" , "MINI14" , "DBS" , "M24" , "P18C"};
        Random random = new Random();
        //GUNFORYOU = GFY
        int gfy = random.nextInt(7);
        System.out.println(guns[gfy]);
    }
}
