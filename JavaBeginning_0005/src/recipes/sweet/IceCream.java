package recipes.sweet;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public class IceCream extends AbstractYummy {
    public IceCream() {
        ingredients = new Ingredient[]{
                new Ingredient("heavy cream", 300, 100),
                new Ingredient("whole milk", 100, 200),
                new Ingredient("sugar", 150, 200),
                new Ingredient("vanilla extract", 5, 10)
        };
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
