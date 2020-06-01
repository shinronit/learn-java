import java.util.Scanner;

public class Custom192 {
    public static void main(String Args[]) {
        int boy = 0;
        int girl = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your gender : " );
        String input = scanner.next();
        if(input.equalsIgnoreCase("boy")){
            System.out.print("Enter age : ");
            String ageInput = scanner.next();
            int age = Integer.parseInt(ageInput);
            boy += age;
        }else if(input.equalsIgnoreCase("girl")){
            System.out.print("Enter age : ");
            String ageInput = scanner.next();
            int age = Integer.parseInt(ageInput);
            girl += age;
        }else {
            System.out.println("Enter 'boy' or 'girl'. Restart the program.");
        }

        if (boy > 16 || girl > 16){
            System.out.println("You can enter");
        }else{
            System.out.println("You cannot enter ");
        }

    }
}