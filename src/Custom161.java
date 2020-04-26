import java.util.Random;
import java.util.Scanner;

public class Custom161 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scanner.next();

        int random1 = random.nextInt(100);
        System.out.println("Hi " + name + " your luck level is : " + random1 + "/100");
        if(random1<20){
            System.out.println("Hi " + name + " you are very unlucky for today.");
        }else if(random1<40){
            System.out.println("Hi " + name + " you are a little  unlucky for today.");
        }else if(random1<60){
            System.out.println("Hi " + name + " you are lucky for today.");
        }else if(random1<80){
            System.out.println("Hi " + name + " you are very lucky for today.");
        }else if(random1==100){
            System.out.println("OMG" + name + " you are super lucky for today.");
        }
    }
}
