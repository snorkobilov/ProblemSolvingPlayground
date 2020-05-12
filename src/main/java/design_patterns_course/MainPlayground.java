package design_patterns_course;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainPlayground {
    private static final Logger logger = Logger.getLogger(MainPlayground.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.FINER);
        ConsoleHandler consoleHandler = new ConsoleHandler();

        consoleHandler.setLevel(Level.FINER);
        logger.addHandler(consoleHandler);

        logger.finest("Finest level logging");
        logger.finer("Finer level logging");
        logger.fine("Fine level logging");
    }
}
