import java.util.Scanner;

public class Age {
    public static void main(String Args[]) {
        Scanner input = new Scanner(System.in);
        AgeClass nabObject = new AgeClass();
        System.out.println("Enter your age :");
        String ans = input.nextLine();
        nabObject.setName(ans);
        nabObject.saying();
        System.out.println(ans);
        System.out.println("Thanks for using me.");
    }
}
