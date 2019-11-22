import java.util.Scanner;
// any class can use public
/// private - only the methods intside the class can access

public class Tutorial16 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            T16nab nabObject = new T16nab();
            System.out.println("Enter your friend name here :");
            String ans = input.nextLine();
            nabObject.setName(ans);
            nabObject.saying();
    }
}
