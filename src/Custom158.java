import java.util.Scanner;

public class Custom158 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter code : ");
            String input = scanner.next();
            Integer inp = Integer.parseInt(input);
            int i = 100;
            if(inp == i) {
                System.out.println("Hii there welcome to secret panel.");
            }else{
                System.out.println("Wrong code.");
            }
        }catch (Exception e ){
            System.out.println("Enter a number not a alphabet or a special symbol.");
        }
    }
}
