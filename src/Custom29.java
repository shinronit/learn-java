import java.util.Scanner;

public class Custom29 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("HOW MANY COMMITS HAVE YOU DONE TODAY");
        System.out.println("SELECT A RANGE 5,10,15,20.");
        input = scanner.nextLine();
        if (input.equals("5")){
            System.out.println("GOOD");
        }else if (input.equals("10")){s
            System.out.println("VERY GOOD");
        }else if (input.equals("15")){
            System.out.println("EXCELLENT WORK!");
        }else if (input.equals("20")){
            System.out.println("IMPRESSIVE");
        }else {
            System.out.println("LOOKS LIKE YOU HAVEN'T DID ANY COMMITS TODAY...");
        }
    }
}
