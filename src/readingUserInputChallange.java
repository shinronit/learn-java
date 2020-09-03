import java.util.Scanner;

public class readingUserInputChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (count!=10){
            count++;
            System.out.println("Enter number #" + count + " : ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                sum += scanner.nextInt();
            }else {
                System.out.println("invalid ");
                break;
            }
        }
        scanner.close();
        System.out.println(sum + " is your sum");
    }
}
