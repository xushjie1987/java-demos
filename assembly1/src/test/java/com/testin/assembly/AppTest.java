package com.testin.assembly;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger log = LoggerFactory.getLogger(AppTest.class);
    
    @Test
    public void test1() {
        log.debug("hello debug");
        log.info("hello info");
    }
}
