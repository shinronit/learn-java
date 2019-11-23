package teaexample;

import java.util.ArrayList;
import java.util.List;

public class Tea {

    TeaType type;
    List<String> ingredients;

    public Tea(TeaType type) {
        this.type = type;
        this.ingredients = new ArrayList<>();
    }

    public String getType() {
        return this.type.toString();
    }

    public void addIngredient(String ingredientName) {
        this.ingredients.add(ingredientName);
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
