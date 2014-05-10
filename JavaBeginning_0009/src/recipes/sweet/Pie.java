package recipes.sweet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public class Pie extends AbstractYummy {
    Logger logger=Logger.getLogger("logger.log");

    public Pie() {
        ingredients = new LinkedList<Ingredient>(Arrays.asList(new Ingredient[]{
                new Ingredient.Builder().setName("flour").setWeight(300).setCalories(100).build(),
                new Ingredient.Builder().setName("sugars").setWeight(100).setCalories(200).build(),
                new Ingredient.Builder().setName("salt").setWeight(5).setCalories(0).build(),
                new Ingredient.Builder().setName("butter").setWeight(30).setCalories(120).build(),
                new Ingredient.Builder().setName("shortening").setWeight(100).setCalories(60).build(),
                new Ingredient.Builder().setName("eggs").setWeight(60).setCalories(30).build(),
                new Ingredient.Builder().setName("milk").setWeight(100).setCalories(50).build()
        }));
    }

    public void cookIt() {
        logger.info("Pie.cookIt()");
    }

    public void eatIt() {
        logger.info("Pie.eatIt()");
    }

    public void wormIt() {
        logger.info("Pie.wormIt()");
    }
}
