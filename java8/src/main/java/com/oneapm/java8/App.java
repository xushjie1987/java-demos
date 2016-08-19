package com.oneapm.java8;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
    
    public static Logger log = Logger.getGlobal();
    
    public static class A<T> {
        T t;
        
        public A(T t) {
            this.t = t;
        }
        
        @Override
        public String toString() {
            return "A [t=" +
                   t +
                   ", toString()=" +
                   super.toString() +
                   "]";
        }
    }
    
    public static class B {
        @Override
        public String toString() {
            return "B [toString()=" +
                   super.toString() +
                   "]";
        }
    }
    
    public static class C extends B {
        @Override
        public String toString() {
            return "C [toString()=" +
                   super.toString() +
                   "]";
        }
    }
    
    public static void fun(A<B> a) {
        log.info(a.toString());
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        A<C> c = new A<App.C>(new C());
        //@formatter:off
        // The method fun(App.A<App.B>) in the type App is not applicable for the arguments (App.A<App.C>)
        //@formatter:on
        // fun(c);
        //@formatter:off
        // Cannot cast from App.A<App.C> to App.A<App.B>
        //@formatter:on
        // fun((A<B>) c);
        // OK
        fun((A) c);
    }
}
