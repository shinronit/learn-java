import java.util.Scanner;

public class Custom60 {
    public static void main (String [] args){
        System.out.println("Type any word and this program will tell you the length");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Length : " + input.length());
    }
}
