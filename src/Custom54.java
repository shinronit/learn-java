import java.util.Scanner;
import java.util.Random;

public class Custom54 {
    public static void main (String [] args){
        System.out.println("Enter Name");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name = scanner.nextLine();
        System.out.println(name.length());
        if(name.length()>10){
            System.out.println("Name is too long");
            System.exit(0);
        }else{
            System.out.println(name);
        }

        String age = getAge(scanner);

        System.out.println("Date of Birth in this form (Date,Month,Year)");
        String dob = scanner.nextLine();
        if(dob.length()>2){
            System.exit(0);
        }
        String dob1 = scanner.nextLine();
        if(dob1.length()>2){
            System.exit(0);
        }
        String dob2 = scanner.nextLine();
        if(dob2.length()>4){
            System.exit(0);
        }
        int j = Integer.parseInt(dob);
        int k = Integer.parseInt(dob1);
        int l = Integer.parseInt(dob2);
        if(l<1800){
            System.out.println("Cannot accept this birth date");
            System.exit(0);
        }
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.printf("Date Of Birth " + "%s-%s-%s",dob,dob1,dob2);
        System.out.println();


        int ran = 1000 + random.nextInt(2000);
        int ran1 = 1000 + random.nextInt(2000);
        int ran2 = 1000 + random.nextInt(2000);
        System.out.printf("YOUR ID IS "+"%s-%s-%s",ran,ran1,ran2);
    }

    public static String getAge(Scanner scanner) {
        String age;
        while (true) {
            try {
                System.out.println("Age:");
                age = scanner.nextLine();
                int a = Integer.parseInt(age);
                if (a <= 0) {
                    System.out.println("Age cannot be negative or zero.");
                    continue;
                }
                break;
            } catch (Exception e){
                System.out.println("Type a number. Please try again.");
            }
        }

        return age;
    }
}















