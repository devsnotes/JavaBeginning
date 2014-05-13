package resipes.sweet;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Created by Vladimir V. Kravchenko on 13.05.2014.
 */
public class Pie extends AbstractYummy {
    Logger logger;
    public Pie() {
        logger = (Logger) LoggerFactory.getLogger("YummyLogger");

        setIngredients(Arrays.asList(new Ingredient[]{
                new Ingredient.Builder().setName("flour").setWeight(300).setCalories(100).setState(IngredientState.AS_IS).build(),
                new Ingredient.Builder().setName("sugars").setWeight(100).setCalories(200).setState(IngredientState.AS_IS).build(),
                new Ingredient.Builder().setName("salt").setWeight(5).setCalories(0).setState(IngredientState.AS_IS).build(),
                new Ingredient.Builder().setName("butter").setWeight(30).setCalories(120).setState(IngredientState.AS_IS).build(),
                new Ingredient.Builder().setName("shortening").setWeight(100).setCalories(60).setState(IngredientState.AS_IS).build(),
                new Ingredient.Builder().setName("eggs").setWeight(60).setCalories(30).setState(IngredientState.FRESH).build(),
                new Ingredient.Builder().setName("milk").setWeight(100).setCalories(50).setState(IngredientState.BOILED).build()
        }));
    }

    @Override
    public void saleIt() {
        setState(YummyState.SOLD);
        logger.debug("Sale");
    }

    @Override
    public void cookIt() {
        setState(YummyState.COOKED);
        logger.debug("Cook");
    }

    @Override
    public void eatIt() {
        setState(YummyState.EATEN);
        logger.debug("Eat");
    }
}
