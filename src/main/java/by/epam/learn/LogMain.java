package by.epam.learn;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMain {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("first info first prg");
        logger.log(Level.WARN,"Warning ! Loggers !");
        try {
            throw new RuntimeException("Exception 1");
        } catch (RuntimeException e) {
            logger.log(Level.ERROR, "runtime", e);
        }
    }
}
