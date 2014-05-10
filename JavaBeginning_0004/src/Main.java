import recipes.sweet.IceCream;
import recipes.sweet.Pie;

public class Main {

    public static void main(String[] args) {

        IceCream iceCream = new IceCream();
        iceCream.cookIt();
        iceCream.coldIt();
        iceCream.eatIt();
        System.out.println("Icecream Calories " + iceCream.getCalories());

        Pie pie = new Pie();
        pie.cookIt();
        pie.wormIt();
        pie.eatIt();
        System.out.println("Pie Calories " + pie.getCalories());

    }
}
