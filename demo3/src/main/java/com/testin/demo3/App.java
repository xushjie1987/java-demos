package com.testin.demo3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    static Logger log = LoggerFactory.getLogger(App.class);
    
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            log.info(i + "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            Thread.sleep(1000L);
        }
    }
}
