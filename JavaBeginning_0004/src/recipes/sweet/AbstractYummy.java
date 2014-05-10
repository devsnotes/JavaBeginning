package recipes.sweet;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public abstract class AbstractYummy implements Yummy {
    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
