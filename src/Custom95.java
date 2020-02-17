import java.util.Scanner;

public class Custom95{
    public static void main (String [] args){
        Custom95 c = new Custom95();
        System.out.println("Basic Calculator");
        System.out.println("Enter what to do + ,-,*,/ ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(int l = 0; l<1;)
        if (input.equals("+")){
            l=2;
            c.add();
        }else if (input.equals("-")){
            l=2;
            c.substract();
        }else if (input.equals("*")){
            l=2;
            c.multiply();
        } else if (input.equals("/")){
            l=2;
            c.divide();
        }else{
            System.out.println("Cannot recognize symbol please use +,-,*,/");
            input = scanner.nextLine();
        }
    }
    public void add(){
        try {
            System.out.println("Enter Number 1");
            Scanner scanner = new Scanner(System.in);
            String num1 = scanner.nextLine();
            if (num1.equals("quit")){
                System.exit(0);
            }
            int a = Integer.parseInt(num1);
            System.out.println("Enter Number 2");
            String num2 = scanner.nextLine();
            int b = Integer.parseInt(num2);
            int answer = a + b;
            System.out.println("Answer : " + answer);
        }catch(Exception e){
            System.out.println("Error adding your equation");
        }
    }
    public void substract(){
        try {
            System.out.println("Enter Number 1");
            Scanner scanner = new Scanner(System.in);
            String num1 = scanner.nextLine();
            if (num1.equals("quit")){
                System.exit(0);
            }
            int a = Integer.parseInt(num1);
            System.out.println("Enter Number 2");
            String num2 = scanner.nextLine();
            int b = Integer.parseInt(num2);
            int answer = a - b;
            System.out.println("Answer : " + answer);
        }catch(Exception e){
            System.out.println("Error subtracting your equation");
        }
    }
    public void multiply(){
        try {
            System.out.println("Enter Number 1");
            Scanner scanner = new Scanner(System.in);
            String num1 = scanner.nextLine();
            if (num1.equals("quit")){
                System.exit(0);
            }
            int a = Integer.parseInt(num1);
            System.out.println("Enter Number 2");
            String num2 = scanner.nextLine();
            int b = Integer.parseInt(num2);
            int answer = a * b;
            System.out.println("Answer : " + answer);
        }catch(Exception e){
            System.out.println("Error multiplying your equation");
        }
    }
    public void divide(){
        try {
            System.out.println("Enter Number 1");
            Scanner scanner = new Scanner(System.in);
            String num1 = scanner.nextLine();
            if (num1.equals("quit")){
                System.exit(0);
            }
            int a = Integer.parseInt(num1);
            System.out.println("Enter Number 2");
            String num2 = scanner.nextLine();
            int b = Integer.parseInt(num2);
            int answer = a / b;
            System.out.println("Answer : " + answer);
        }catch(Exception e){
            System.out.println("Error solving your equation");
        }
    }
}