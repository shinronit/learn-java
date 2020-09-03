import java.util.Scanner;

public class readingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();//handle next line character (enter key )

        int age = 2020 - yearOfBirth;
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();



        System.out.println("Your name is " + name + " and you are " + age + " years old.");

        scanner.close();
    }
}
