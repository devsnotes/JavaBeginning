package recipes.sweet;

import java.util.Arrays;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public abstract class AbstractYummy implements Yummy {
    public Ingredient[] ingredients;

    private int calories;

    public int getCalories() {
        calories = 0;
        for(Ingredient item:ingredients) {
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
        sb.append("ingredients=").append(Arrays.toString(ingredients));
        sb.append(", calories=").append(getCalories());
        sb.append('}');
        return sb.toString();
    }
}
