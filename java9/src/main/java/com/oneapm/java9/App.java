package com.oneapm.java9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-'W'ww-E'T'HH:mm:ssZZ");
        System.out.println(df.format(new Date()));
        df = new SimpleDateFormat("dd/E/yyyy:HH:mm:ss");
        System.out.println(df.format(new Date()));
        df = new SimpleDateFormat("dd/M/yyyy:HH:mm:ss");
        System.out.println(df.format(new Date()));
        df = new SimpleDateFormat("dd/L/yyyy:HH:mm:ss");
        System.out.println(df.format(new Date()));
        df = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss");
        System.out.println(df.format(new Date()));
        df = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ssZZ");
        System.out.println(df.format(new Date()));
    }
}
