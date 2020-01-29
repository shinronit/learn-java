import java.util.Scanner;

public class Custom64 {
    public static void main (String[] args){
        System.out.println("Do you want to join a clan");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("yes")){
            System.out.println("Welcome");
        }else if(input.equals("no")){
            System.out.println("Ok");
        }else{
            System.out.println("YourInput " + input +" cannot be used please check and try again");
        }
    }
}
