import java.util.Scanner;

public class Custom178 {
    public static void main(String[] args){
        String name [] = {"Ronit" , "Cuckoo" ,"Shinco","Aban"};
        if(name.length==4){
            System.out.println("We have " + name.length + " players in team . " + name.length );
        }
        if(name.length==4){
            System.out.println("1st player : " + name[0]);
            System.out.println("2nd player : " + name[1]);
            System.out.println("3rd player : " + name[2]);
            System.out.println("4th player : " + name[3]);
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("ban")){
            System.out.print("Which player : " );
            input = scanner.next();
            if(input.equalsIgnoreCase(name[0])){
                System.out.println("Banned " + name[0]);
                System.out.println("Players Left " + name[1] + " " + name[2] + " " + name[3]);
            }else if(input.equalsIgnoreCase(name[1])){
                System.out.println("Banned " + name[1]);
                System.out.println("Players Left " + name[0] + " " +name[2]+ " " +name[3]);
            }else if(input.equalsIgnoreCase(name[2])){
                System.out.println("Banned " + name[2]);
                System.out.println("Players Left " + name[0]+ " " +name[1]+ " " +name[3]);
            }else if(input.equalsIgnoreCase(name[3])){
                System.out.println("Banned " + name[3]);
                System.out.println("Players Left " + name[0]+name[1]+ " " +name[2]);
            }else {
                System.out.println("Could not find player.");
            }
            System.out.println("Console END*");
        }
    }
}
