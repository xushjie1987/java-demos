package com.testin;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Hello world!
 */
public class App {
    public static class A<T> {
    }

    static A<String> a = new A<>();

    public static void main(String[] args) throws NoSuchFieldException {
        Type t = App.class.getDeclaredField("a")
                          .getGenericType();
        System.out.println(t.getTypeName()); // com.testin.App.com.testin.App$A<java.lang.String>
        ParameterizedType pt = ((ParameterizedType) t);
        System.out.println(pt.getRawType()
                             .getTypeName()); // com.testin.App$A
        System.out.println(pt.getActualTypeArguments()[0].getTypeName()); // java.lang.String
    }
}
