package teaexample;

public class GreenTeaBuilder {

    GreenTea greentea;

    public GreenTeaBuilder() {
    }

    public void addMilk() {
        System.out.println("Adding milk");
        greentea.addIngredient("Milk");
    }

    public void addSugar() {
        System.out.println("Adding sugar");
        greentea.addIngredient("Sugar");
    }

    public void addGreenTeaPowder() {
        System.out.println("Adding green tea powder");
        greentea.addIngredient("Green Tea Powder");
    }

    public void addTeaMasala() {
        System.out.println("Adding tea masala");
        greentea.addIngredient("Tea Masala");
    }

    public GreenTea makeGreenTea() {
        this.greentea = new GreenTea(TeaType.GREEN_TEA);
        addMilk();
        addGreenTeaPowder();
        addTeaMasala();
        addSugar();
        return greentea;
    }
}
