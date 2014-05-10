package recipes.sweet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public class IceCream extends AbstractYummy {
    Logger logger=Logger.getLogger("logger.log");

    public IceCream() {
        ingredients = new LinkedList<Ingredient>(Arrays.asList(new Ingredient[]{
                new Ingredient.Builder().setName("heavy cream").setWeight(300).setCalories(100).build(),
                new Ingredient.Builder().setName("whole milk").setWeight(100).setCalories(200).build(),
                new Ingredient.Builder().setName("sugar").setWeight(150).setCalories(200).build(),
                new Ingredient.Builder().setName("vanilla extract").setWeight(5).setCalories(10).build()
        }));
    }

    public void cookIt() {
        logger.info("IceCream.cookIt()");
    }

    public void eatIt() {
        logger.info("IceCream.eatIt()");
    }

    public void coldIt() {
        logger.info("IceCream.coldIt()");
    }

}
