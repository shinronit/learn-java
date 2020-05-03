import java.util.Scanner;

public class Custom167 {
    public static void main(String[] args){
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String input ;
        for (;;) {
            System.out.println("Counting Numbers :  "+i);
            i--;
            if(i==-1111111){
                System.out.println("Do you want to contunue ?    Y/N");
                input = scanner.nextLine();
                if(input.equalsIgnoreCase("y")){

                }else {
                    System.out.println("Thanks I was tired of doing that.");
                    System.exit(0);
                }
            }
        }
    }
}
