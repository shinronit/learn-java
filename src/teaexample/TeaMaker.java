package teaexample;

import java.util.Scanner;

public class TeaMaker {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Which tea do you want to make 'Milk Tea' or 'Green Tea'?");
        System.out.println("Type down");
        String teaType = input.nextLine();

        if (teaType.equals("Milk Tea")){
            Teabuilder teaBuilder = new Teabuilder();
            Tea tea = teaBuilder.makeMilkTea();
            System.out.println("Here is your tea with following ingredients: " + tea.getIngredients());
        } else if (teaType.equals("Green Tea")) {
            GreenTeaBuilder teaBuilder = new GreenTeaBuilder();
            GreenTea tea = teaBuilder.makeGreenTea();
            System.out.println("Here is your green tea with following ingredients: " + tea.getIngredients());
        } else {
            System.out.println("No such tea found.");
        }
    }
}
