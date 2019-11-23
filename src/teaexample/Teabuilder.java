package teaexample;

import java.util.Scanner;

public class Teabuilder {

    Tea tea;

    public Teabuilder() {
    }

    public void addMilk() {
        System.out.println("Adding milk");
        tea.addIngredient("Milk");
    }

    public void addSugar() {
        System.out.println("Adding sugar");
        tea.addIngredient("Sugar");
    }

    public void addTeaPowder() {
        System.out.println("Adding tea powder");
        tea.addIngredient("Tea Powder");
    }

    public void addTeaMasala() {
        System.out.println("Adding tea masala");
        tea.addIngredient("Tea Masala");
    }

    public Tea makeMilkTea() {
        this.tea = new Tea(TeaType.MILK_TEA);
        addMilk();
        addTeaPowder();
        addTeaMasala();
        addSugar();
        return tea;
    }
}
