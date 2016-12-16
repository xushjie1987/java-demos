package com.testin.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.testin.C;
import com.testin.b.B;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    @Autowired(required = false)
    private A a;
    @Autowired(required = false)
    private B b;
    @Autowired(required = false)
    private C c;
    
    public void test() {
        System.out.println("test");
    }
    
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class,
                                                                                  args);
        App app = applicationContext.getBean(App.class);
        app.test();
        System.out.println("Hello World!");
        Thread.sleep(Long.MAX_VALUE);
    }
}
