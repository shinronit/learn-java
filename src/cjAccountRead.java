import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class cjAccountRead {
    public void readFile(){
        BufferedReader reader;
        System.out.println("Your account information");
        try{
            reader = new BufferedReader(new FileReader("cjData.txt"));
            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
