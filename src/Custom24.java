import java.util.Scanner;

public class Custom24 {
    public static void main (String[]args){
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("THIS PROGRAM WILL HELP YOU TO JOIN SECRET RESEARCH TEAM");
        System.out.println("PLEASE ENTER YOUR SECRET CODE HERE");
        String input = consoleInput.nextLine();
        if(input.equals("SHINCOCHAN")){
            System.out.println("WELCOME TO THE ARMY");
        }else{
            System.out.println("YOU DON'T KNOW THE SECRET CODE");
        }
    }
}
