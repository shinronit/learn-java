import java.util.Random;
import java.util.Scanner;

public class Custom146 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name = playerName(scanner);
        int i = playerAge(scanner,name);
        String startGqme = startGame(name,scanner);
        int score = inGame(scanner,random);
        System.out.println("YOU SCORED : " + score);

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
    public static String startGame(String name,Scanner scanner){
        System.out.println("Hello " + name + "Do you want to start this game?   Y/N ");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("y")){
            System.out.println("Great lets get started.");
        }else if(input.equalsIgnoreCase("n")){
            System.out.println("Ohk as you wish see you soon.");
            System.exit(0);
        }else {
            System.out.println("Please type y or n .... ( y = yes , n = no )");
            System.exit(0);
        }return input;
    }
    public static int inGame(Scanner scanner, Random random){
        int score = 0;
        for (int i = 0;i<5;i++) {
            int randm = random.nextInt(10);
            System.out.println("Choose a number between 0 to 10");
            String input = scanner.nextLine();
            int inp = Integer.parseInt(input);
            if(inp==randm){
                if(randm<5){
                    System.out.println("Oh You got it right.");
                }else {
                    System.out.println("Nice Your guess was correct.");
                }
                score += 100;
            }else {
                System.out.println("OOPS,correct answer is " + randm);
            }
        }return score;
    }
}
