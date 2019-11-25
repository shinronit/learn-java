public class Tutorial18 {
    public static void main(String []args){
        int age =  60;

        if (age < 50){
            System.out.println("You are young");
        }else{
            System.out.println("You are old");
            // having if statement inside a if statement is known as nesting
            if (age > 75){
                System.out.println("You are really old ");
            }else{
                System.out.println("dont worry you still have a lot of days left");
            }
        }
    }
}
