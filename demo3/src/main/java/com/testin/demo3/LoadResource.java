/**
 * Project Name:demo3
 * File Name:LoadResource.java
 * Package Name:com.testin.demo3
 * Date: 
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.testin.demo3;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * ClassName:LoadResource <br/>
 * Function: <br/>
 * Date: <br/>
 * 
 * @author hadoop
 * @version
 * @since JDK 1.8
 * @see
 */
public class LoadResource {
    
    public static void main(String[] args) throws URISyntaxException, IOException {
        URL url = Thread.currentThread()
                        .getContextClassLoader()
                        .getResource("logback.xml");
        // file:/data/github/java-demos/demo3/target/classes/logback.xml
        System.out.println(url);
        Files.readAllLines(Paths.get(url.toURI()))
             .stream()
             .forEach(System.out::println);
        // /data/github/java-demos/demo3/target/classes/logback.xml
        System.out.println(Paths.get(url.toURI()));
    }
}
