import java.util.Scanner;

public class Duplicator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfTimes;
        String times;
        String textToPrint;
        System.out.println("What to print?");
        System.out.print("Your input ");
        textToPrint = scanner.next();

        System.out.println("How Many Times?");
        System.out.print("Your input ");
        times = scanner.next();
        numberOfTimes = Integer.parseInt(times);

        for (int i = 0 ; i<numberOfTimes;i++){
            System.out.println(textToPrint);
        }

    }
}
