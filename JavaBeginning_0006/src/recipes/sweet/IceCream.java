package recipes.sweet;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public class IceCream extends AbstractYummy {
    public IceCream() {
        ingredients = new ArrayList<Ingredient>(Arrays.asList(new Ingredient[]{
                new Ingredient("heavy cream", 300, 100),
                new Ingredient("whole milk", 100, 200),
                new Ingredient("sugar", 150, 200),
                new Ingredient("vanilla extract", 5, 10)
        }));
        /*ingredients.add(new Ingredient("heavy cream", 300, 100));
        ingredients.add(new Ingredient("whole milk", 100, 200));
        ingredients.add(new Ingredient("sugar", 150, 200));
        ingredients.add(new Ingredient("vanilla extract", 5, 10));*/
    }

    public void cookIt() {
        System.out.println("IceCream.cookIt()");
    }

    public void eatIt() {
        System.out.println("IceCream.eatIt()");
    }

    public void coldIt() {
        System.out.println("IceCream.coldIt()");
    }

}
