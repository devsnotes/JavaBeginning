package recipes.sweet;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public class IceCream extends Yummy {
    public IceCream() {
        calories = 200;
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
