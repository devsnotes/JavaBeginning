import ch.qos.logback.classic.Level;
import org.slf4j.LoggerFactory;
import resipes.sweet.IceCream;
import resipes.sweet.Pie;
import resipes.sweet.YummyForSale;

public class Main {

    public static void main(String[] args) {
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("YummyLogger");
        logger.setLevel(Level.DEBUG);

        YummyForSale iceCream = new IceCream();
        iceCream.cookIt();
        iceCream.eatIt();

        logger.info(new StringBuilder()
                .append("Yummy=").append(iceCream.getClass().getSimpleName())
                .append(" Weight=").append(iceCream.getWeight())
                .append(" Calories=").append(iceCream.getCalories())
                .append(" State=").append(iceCream.getState())
                .toString());

        YummyForSale pie = new Pie();
        pie.cookIt();
        pie.saleIt();

        logger.info(new StringBuilder()
                .append("Yummy=").append(pie.getClass().getSimpleName())
                .append(" Weight=").append(pie.getWeight())
                .append(" Calories=").append(pie.getCalories())
                .append(" State=").append(pie.getState())
                .toString());

        logger.info("Say goodbye!!!");
    }
}
