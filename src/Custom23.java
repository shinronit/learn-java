import java.util.Random;

public class Custom23 {
    public static void main (String[]args){
        Random random = new Random();
        int age = random.nextInt(50);
        System.out.println(age);
        if (age<10){
            System.out.println("You are a kid");
        }else if (age<25){
            System.out.println("You are young");
        }else{
            System.out.println("Come on man I dont know ur age");
        }
    }
}
