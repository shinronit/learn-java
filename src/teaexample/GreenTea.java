package teaexample;

import java.util.ArrayList;
import java.util.List;

public class GreenTea {

    TeaType type;
    List<String> greenTeaIngredients;

    public GreenTea(TeaType type) {
        this.type = type;
        this.greenTeaIngredients = new ArrayList<>();
    }

    public String getType() {
        return this.type.toString();
    }

    public void addIngredient(String ingredientName) {
        this.greenTeaIngredients.add(ingredientName);
    }

    public List<String> getIngredients() {
        return greenTeaIngredients;
    }
}
