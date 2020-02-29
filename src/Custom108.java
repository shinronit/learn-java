import java.util.Scanner;

public class Custom108 {
    public static void main (String [] args){
        System.out.println("Type anything");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Type how many times you want copy");
        try {
            String cop = scanner.nextLine();
            int fo = Integer.parseInt(cop);
            if (fo<0){
                System.out.println("Cannot accept a minus input");
                System.exit(0);
            }
            for(int i = 0;i < fo;i++) {
                System.out.println(input);
            }
        }catch (Exception e){
            System.out.println("Error taking that number");
        }
    }
}
