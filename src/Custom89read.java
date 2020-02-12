import java.util.*;
import java.io.*;

public class Custom89read {

    private Scanner x;
    private Scanner y;
    public void openFile(){
        try {
            x = new Scanner(new File("tusharcard.txt"));
            y = new Scanner(new File("tusharcardbackup"));
        }
        catch (Exception e){
            System.out.println("could not find file");
        }
    }
    public void readFile(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s\n",a,b,c);
        }
    }
    public void closeFile(){
        x.close();
    }
}
