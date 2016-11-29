/**
 * Project Name:demo2
 * File Name:Echo.java
 * Package Name:com.testin.demo2
 * Date: 
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.testin.demo2;

import java.io.File;
import java.io.IOException;

/**
 * ClassName:Echo <br/>
 * Function: <br/>
 * Date: <br/>
 * 
 * @author hadoop
 * @version
 * @since JDK 1.8
 * @see
 */
public class Echo {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        File f = new File("echo.log");
        while (true) {
            Process process = new ProcessBuilder("java",
                                                 "-cp",
                                                 "/data/github/java-demos/demo2/target/classes",
                                                 "com.testin.demo2.A").redirectErrorStream(true)
                                                                      .redirectOutput(f)
                                                                      .redirectError(f)
                                                                      .start();
            Thread.sleep(5000L);
        }
    }
    
}
