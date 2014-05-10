package recipes.sweet;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public abstract class AbstractYummy implements Yummy {
    public List<Ingredient> ingredients;

    private int calories;

    public int getCalories() {
        calories = 0;
        Iterator<Ingredient> iterator=ingredients.iterator();
        while(iterator.hasNext()) {
            Ingredient item = iterator.next();
            calories+=item.getCalories()*item.getWeight()/100;
        }
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName()+"{");
        sb.append("ingredients=").append(ingredients.toString());
        sb.append(", calories=").append(getCalories());
        sb.append('}');
        return sb.toString();
    }
}
