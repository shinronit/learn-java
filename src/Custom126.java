import java.util.Scanner;

public class Custom126 {
    public static void main (String []args){
        int score = 0;
        System.out.println("Guess the fruits name");
        String apple = "apple";
        String banana = "banana";
        String watermelon = "watermelon";
        Scanner scanner = new Scanner(System.in);
        System.out.println("This fruit is red in color tastes sweet and has black seeds ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase(apple)){
            System.out.println("Correct");
            score += 10;
        }else{
            System.out.println("oops it is " + apple);
        }
        System.out.println("This fruit is yellow in color tastes very sweet and has no seeds ");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase(banana)){
            System.out.println("Correct");
            score += 10;
        }else{
            System.out.println("oops it is " + banana);
        }
        System.out.println("This fruit is green in color from outside and red inside tastes very sweet and has too many seeds ");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase(watermelon)){
            System.out.println("Correct");
            score += 10;
        }else{
            System.out.println("oops it is " + watermelon);
        }
        if (score==10){
            System.out.println("was that an accident you score : " + score);
        }else if (score==20){
            System.out.println("Oh you are good at these you score : " + score);
        }else if (score==30){
            System.out.println("Oh you are too intelligent you score : " + score);
        }else{
            System.out.println("you should better try again");
        }
    }
}
