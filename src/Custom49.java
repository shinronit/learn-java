import java.util.Scanner;

public class Custom49 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int animal = 10;
        String animals = "cow" +" dog" + " cat";
        System.out.println(animals);
        System.out.println("Choose one");
        String input = scanner.nextLine();
        if(input.equals("cow")){
            System.out.println("I think you love cows");
        }else if(input.equals("dog")){
            System.out.println("I think you love dogs");
        }else if(input.equals("cat")) {
            System.out.println("I think you love cats");
        }else{
            System.out.println("YOU DIDN'T CHOOSE A ANIMAL");

        }

    }
}
