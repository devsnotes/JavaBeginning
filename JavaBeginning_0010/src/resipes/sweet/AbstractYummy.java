package resipes.sweet;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Vladimir V. Kravchenko on 13.05.2014.
 */
public abstract class AbstractYummy implements YummyForSale{
    protected List<Ingredient> ingredients;
    private int calories;
    private int weight;
    private YummyState state;

    {
        state = YummyState.NOT_READY;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        calculate();
    }

    public void setState(YummyState state) {
        this.state = state;
    }

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }

    public YummyState getState() {
        return state;
    }

    protected void calculate() {
        calculateWeight();
        calculateCalories();
    }

    private void calculateCalories() {
        calories = 0;
        if (weight>0) {
            Iterator<Ingredient> iterator = ingredients.iterator();
            while (iterator.hasNext()) {
                Ingredient item = iterator.next();
                calories += item.getCalories() * item.getWeight() / 100;
            }
        }
    }

    private void calculateWeight() {
        weight = 0;
        Iterator<Ingredient> iterator=ingredients.iterator();
        while(iterator.hasNext()) {
            Ingredient item = iterator.next();
            weight+=item.getWeight();
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName()+"{");
        sb.append("ingredients=").append(ingredients);
        sb.append(", calories=").append(calories);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
