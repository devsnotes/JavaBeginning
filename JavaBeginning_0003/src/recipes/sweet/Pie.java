package recipes.sweet;

/**
 * Created by Vladimir V. Kravchenko on 09.05.2014.
 */
public class Pie extends AbstractYummy {
    public Pie() {
        calories = 180;
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
