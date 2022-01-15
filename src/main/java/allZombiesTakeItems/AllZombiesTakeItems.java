package allZombiesTakeItems;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AllZombiesTakeItems implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "allzombiestakeitems_lostallmymoney";
    public static final String MOD_NAME = "AllZombiesTakeItems";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing All Zombies Take Items");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}