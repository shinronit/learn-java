import java.util.Scanner;

public class Custom189 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.print("Enter your name : ");
        String name = scanner.next();
        try{
            int nCheck = Integer.parseInt(name);
            System.out.println("Enter a valid name.");
            System.exit(0);
        }catch ( Exception e  ){
            System.out.println("Nice name " + name +" Let's move ahead.");
        }
        int age;
        System.out.print("Enter your age : ");
        String ageInput = scanner.next();
        try{
            age = Integer.parseInt(ageInput);
            if(age>18){
                System.out.println("Cool");
            }else {
                System.out.println("Creating a child account.");
                System.out.println("Processing...");
            }
        }catch ( Exception e ){
            System.out.println("Enter your age in number.");
        }
        System.out.println("Enter Month ");
        System.out.println();
        String dob;
        dob = scanner.nextLine();
        if(dob.equalsIgnoreCase("")){
            System.out.println("You have submitted empty blocks this can be changed later.");
        }else{
            System.out.println("OK thats great.");
        }
    }
}
