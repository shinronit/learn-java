import java.util.*;

public class Custom125 {
    public static void main (String [] args){

        final Formatter x;

        try{
            x = new Formatter("test.java");
            System.out.println("you created a file");
        }
        catch(Exception e){
            System.out.println("you got an error");
        }
    }
}
