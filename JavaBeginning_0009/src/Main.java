import recipes.sweet.IceCream;
import recipes.sweet.Pie;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main(String[] args) {
        Logger logger=Logger.getLogger("logger.log");
        logger.setLevel(Level.INFO);
        try {
            FileHandler logFile=new FileHandler("result.log");
            logFile.setFormatter(new SimpleFormatter());
            logger.addHandler(logFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


        IceCream iceCream = new IceCream();
        iceCream.cookIt();
        iceCream.coldIt();
        iceCream.eatIt();

        logger.info(iceCream.toString());

        Pie pie = new Pie();
        pie.cookIt();
        pie.wormIt();
        pie.eatIt();

        logger.info(pie.toString());
    }
}
