import java.util.Random;
import java.util.Scanner;

public class Custom169 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(0);
        printSomethingNumberOFTimes();

    }
    public static void printSomethingNumberOFTimes(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(0);
        System.out.println("Enter commands to get started.");
        System.out.print("Command : ");
        String input = scanner.next();
        if(input.equalsIgnoreCase("print")){
            System.out.print("Enter what to print : " );
            input = scanner.next();
            System.out.print("Enter number of times to print : ");
            String forinput = scanner.nextLine();
            forinput = scanner.nextLine();
            System.out.println("Show side numbers ? Y/N");
            String sideNumbers = scanner.nextLine();
            int i = Integer.parseInt(forinput);
            if(sideNumbers.equalsIgnoreCase("Y")){
                for (int j = 0;j<i;j++) {
                    System.out.println(1 + j + ") " + input);
                }
            }else if(sideNumbers.equalsIgnoreCase("n")){
                for (int j = 0;j<i;j++) {
                    System.out.println(input);
                }
            }else {
                System.out.println("Your command is not supported.");
            }
        }
    }
}
