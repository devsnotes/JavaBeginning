package recipes.sweet;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public class Pie extends AbstractYummy {
    public Pie() {
        ingredients = new ArrayList<Ingredient>(Arrays.asList(new Ingredient[]{
                new Ingredient("flour", 300, 100),
                new Ingredient("sugars", 100, 200),
                new Ingredient("salt", 5, 0),
                new Ingredient("butter", 30, 120),
                new Ingredient("shortening", 100, 60),
                new Ingredient("eggs", 60, 30),
                new Ingredient("milk", 100, 50)
        }));
       /* ingredients.add(new Ingredient("flour", 300, 100));
        ingredients.add(new Ingredient("sugars", 100, 200));
        ingredients.add(new Ingredient("salt", 5, 0));
        ingredients.add(new Ingredient("butter", 30, 120));
        ingredients.add(new Ingredient("shortening", 100, 60));
        ingredients.add(new Ingredient("eggs", 60, 30));
        ingredients.add(new Ingredient("milk", 100, 50));*/
    }

    public void cookIt() {
        System.out.println("Pie.cookIt()");
    }

    public void eatIt() {
        System.out.println("Pie.eatIt()");
    }

    public void wormIt() {
        System.out.println("Pie.wormIt()");
    }
}
