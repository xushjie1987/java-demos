/**
 * Project Name:java1
 * File Name:App.java
 * Package Name:com.oneapm.java1
 * Date:2016年8月2日下午1:36:05
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.java1;

/**
 * ClassName:App <br/>
 * Function: <br/>
 * Date: 2016年8月2日 下午1:36:05 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class App {
    
    public static void test(InterfaceA fun) {
        System.out.println(fun.fun(new ClassC()));
    }
    
    /**
     * main: <br/>
     * @author xushjie
     * @param args
     * @since JDK 1.7
     */
    public static void main(String[] args) {
        // Class::staticMethod
        // x -> f(x)
        test(ClassA::fun);
        // object::instanceMethod
        // x -> f(x)
        ClassB b = new ClassB();
        test(b::fun);
        // Class::instanceMethod
        // (x, y) -> x.f(y)
        test(ClassC::fun);
    }
    
}
