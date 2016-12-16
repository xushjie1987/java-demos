/**
 * Project Name:demo11
 * File Name:TestX.java
 * Package Name:com.testin.a
 * Date:2016年12月17日上午11:32:50
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.testin.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.testin.b.B;

/**
 * ClassName:TestX <br/>
 * Function: <br/>
 * Date: 2016年12月17日 上午11:32:50 <br/>
 * 
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
@SpringBootConfiguration
public class TestX {
    
    @Autowired
    private B b;
    
    @Bean
    public B b() {
        return new B();
    }
    
    public void test() {
        System.out.println("test");
    }
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(TestX.class);
        ctx.refresh();
        TestX myBean = ctx.getBean(TestX.class);
        myBean.test();
    }
    
}
