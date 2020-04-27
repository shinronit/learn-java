import java.util.Scanner;

public class Custom162 {
    public static void main(String[] args){
        String replytoHii = "Hello there how u doing?";
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("hi")){
            System.out.println(replytoHii);
        }
    }
}
