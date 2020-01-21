import java.util.*;

public class Tutorial79 {
    public static void main (String [] args){

        final Formatter x;

        try{
            x = new Formatter("ronit.txt");
            System.out.println("you created a file");
        }
        catch(Exception e){
            System.out.println("you got an error");
        }
    }
}
