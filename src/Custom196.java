import java.util.Random;

public class Custom196 {
    public static void main(String[] args){
        String maps [] = {"ERANGEL" , "MIRARMAR" , "SANHOK" , "VIKENDI"};
        Random random = new Random();
        //GUNFORYOU = GFY
        int gfy = random.nextInt(3);
        System.out.println("You should play : " + maps[gfy]);
    }
}
