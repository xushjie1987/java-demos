package com.testin.demo5;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("hello".matches(".*o")); // true
        System.out.println("hello".matches("(?>.*)o")); // false
    }
}
