import java.io.File;

public class Tutorial78 {
    public static void main (String [] args){

        File x = new File("C:\\java\\cuckoo.txt");

        if(x.exists()){
            System.out.println(x.getName() + "exist");
        }else{
            System.out.println("This thing does not exist");
        }

    }
}
