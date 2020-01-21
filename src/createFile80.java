import java.io.*;
import java.lang.*;
import java.util.*;

public class createFile80 {

    private Formatter x;

    public void openFile(){
        try {
            x = new Formatter("ronit1.txt");
        }catch(Exception e) {
            System.out.println("Error");
        }
    }
    public void addRecords(){
        x .format("%s%s%s", "20", "ronit", "thakur");
    }
    public void closeFile(){
        x.close();
    }
}
