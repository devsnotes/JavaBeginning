package resipes.sweet;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Vladimir V. Kravchenko on 13.05.2014.
 */
public class IceCream extends AbstractYummy {
    private Logger logger;

    public IceCream() {
        logger= (Logger) LoggerFactory.getLogger("YummyLogger");

        setIngredients(new LinkedList<Ingredient>(Arrays.asList(new Ingredient[]{
                new Ingredient.Builder().setName("heavy cream").setWeight(300).setCalories(100).setState(IngredientState.SHAKED).build(),
                new Ingredient.Builder().setName("whole milk").setWeight(100).setCalories(200).setState(IngredientState.AS_IS).build(),
                new Ingredient.Builder().setName("sugar").setWeight(150).setCalories(200).setState(IngredientState.AS_IS).build(),
                new Ingredient.Builder().setName("vanilla extract").setWeight(5).setCalories(10).setState(IngredientState.AS_IS).build()
        })));
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
