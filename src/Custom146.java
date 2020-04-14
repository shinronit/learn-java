import java.util.Scanner;

public class Custom146 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = playerName(scanner);
        int i = playerAge(scanner,name);
    }
    public static String playerName(Scanner scanner){
        System.out.print("Hi There , Enter your Name : ");
        String playerName = scanner.nextLine();
        if(playerName.length()==0){
            System.out.println("Player name cannot be empty");
            System.exit(0);
        }else if(playerName.length()<2){
            System.out.println("Please enter a correct name not a short form ");
            System.exit(0);
        }else if(playerName.length()>12){
            System.out.println("Cannot accept this name please enter a short name");
            System.exit(0);
        }else {
            System.out.println("Welcome " + playerName);
        }return playerName;
    }
    public static int playerAge(Scanner scanner,String name){
        System.out.println("Hey " + name + ", Enter your age.");
        try{
            String input = scanner.nextLine();
            int age = Integer.parseInt(input);
            return age;
        }catch (Exception e){
            System.out.println("Your input doesn't looks like a age.Please try again with a number.");
        }
        int i = playerAge(scanner,name);
        if(i<10){
            System.out.println("Looks like you are too young to play computer games.");
        }else if(i>90){
            System.out.println("Your age is too high for playing games.");
        }else {
            System.out.println("Great");
        }return i;
    }
    public static String startGame(String name){
        System.out.println("Hello " + name + "Do you want to start this game?");

    }
}
