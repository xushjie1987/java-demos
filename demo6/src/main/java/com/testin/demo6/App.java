package com.testin.demo6;

import org.perf4j.slf4j.aop.TimingAspect;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Hello world!
 */
@SpringBootConfiguration
@EnableAspectJAutoProxy
public class App {
    @Bean
    public TimingAspect timingAspect() {
        return new TimingAspect();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
