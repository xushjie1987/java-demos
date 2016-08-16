package com.oneapm.java7;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
    
    public static final Logger log    = Logger.getGlobal();
    
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    
    /**
     * main: <br/>
     * @author xushjie
     * @param args
     * @since JDK 1.7
     */
    public static void main(String[] args) {
        log.log(Level.WARNING,
                "java uitl warning log");
        log.info("java util info log");
        //
        logger.log(Level.SEVERE,
                   "java util server log");
        //
        Logger l = Logger.getAnonymousLogger();
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        l.setLevel(Level.ALL);
        l.addHandler(handler);
        l.log(Level.FINEST,
              "java util finest log");
    }
    
}
