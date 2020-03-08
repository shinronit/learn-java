import java.util.Scanner;

public class Custom113 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose 1 to convert inr to usd or 2 for coverting usd to inr");
        String inppt = scanner.nextLine();
        if (inppt.equals("1")){
            convert("INR", "USD", 1 / 74.01f);
        }else if (inppt.equals("2")){
            convert("USD", "INR", 74.01f);
        }
    }

    public static void convert(String from, String to, Float conversionFactor){
        System.out.println("Compiler version 1.12");
        System.out.println("CONVERT " + from + " TO " + to);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        float inr = Float.parseFloat(input);
        float USD = (inr * conversionFactor);
        System.out.println(inr + "" + from + " IS " + USD + to);
        System.out.println("Enter new number");
    }
}


















