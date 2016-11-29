package com.testin.demo2;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        File f = new File("pom.xml");
        System.out.println(Files.readAllLines(Paths.get(f.toURI()))
                                .stream()
                                .count());
        f = new File("/etc/profile");
        System.out.println(Files.readAllLines(Paths.get(f.toURI()))
                                .stream()
                                .count());
    }
}
