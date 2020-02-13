import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Custom90 {
    public static void main(String[] args) throws IOException {
        System.out.println("Type something that you want to add to a file");
        //Write content to file
        writeFileContents();
        //Reading content of file using Scanner class
        readFileContents();

    }

    public static void writeFileContents() throws IOException {

        try (FileWriter fileWriter = new FileWriter("cuckoo.txt")) {
            Scanner sca = new Scanner(System.in);
            String input = sca.nextLine();
            fileWriter.write(input);
        }
    }

    public static void readFileContents() throws IOException {
        System.out.println("Reading contents of file using Scanner class:");
        try (FileReader fileReader = new FileReader("cuckoo.txt");
            Scanner scanner=new Scanner(fileReader)) {
            while (scanner.hasNext()) {
                if(scanner.hasNextInt()) {
                    System.out.println(scanner.nextInt());
                } else if(scanner.hasNextDouble()) {
                    System.out.println(scanner.nextDouble());
                } else if(scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            }
        }
    }
}

















