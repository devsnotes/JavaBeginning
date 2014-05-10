import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import recipes.sweet.AbstractYummy;
import recipes.sweet.Ingredient;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;


public class AbstractYummyTest {
    private AbstractYummy yummy;

    @Before
    public void setUp() throws Exception {
        yummy = new AbstractYummy() {
            @Override
            public void cookIt() {

            }

            @Override
            public void eatIt() {

            }
        };

    }

    @Test
    public void testGetSimpleCalories() throws Exception {
        yummy.ingredients = new LinkedList<Ingredient>(Arrays.asList(new Ingredient[]{
                        new Ingredient.Builder().setName("item").setWeight(100).setCalories(100).build()
                }
        ));
        Assert.assertEquals(yummy.getCalories(), 100);
    }

    @Test
    public void testGetNullCalories() throws Exception {
        yummy.ingredients = new LinkedList<Ingredient>(Arrays.asList(new Ingredient[]{
                        new Ingredient.Builder().setName("item").build()
                }
        ));
        Assert.assertEquals(yummy.getCalories(), 0);
    }

    @Test
    public void testGetRandomCalories() throws Exception {
        int[][] weightCalories = new int[][] {
                {100,100},
                {500,100},
                {100,500},
                {500,500}
        };
        Ingredient[] ingredients=new Ingredient[weightCalories.length];
        for (int i = 0; i < weightCalories.length; i++) {
            ingredients[i] = new Ingredient.Builder().setName("item"+String.valueOf(i)).setWeight(weightCalories[i][0]).setCalories(weightCalories[i][1]).build();
        }
        yummy.ingredients = new LinkedList<Ingredient>(Arrays.asList(ingredients));

        Assert.assertEquals(yummy.getCalories(), 3600);
    }

    @After
    public void tearDown() throws Exception {


    }
}