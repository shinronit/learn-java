import java.util.Scanner;

public class Tutorial15 {
    public static void main(String Args[]) {

            Scanner input = new Scanner(System.in);
            T15nab nabObject = new T15nab();

            System.out.println("Enter Your name here");
            String name = input.nextLine();

            nabObject.simpleMessage(name);
    }
}
