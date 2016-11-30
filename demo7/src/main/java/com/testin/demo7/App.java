package com.testin.demo7;

import org.perf4j.slf4j.aop.TimingAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.testin.demo7" })
@Controller
@RequestMapping(path = "/perf")
public class App {
    static Logger   log = LoggerFactory.getLogger(App.class);
    
    @Autowired
    public PerfBean perfBean;
    
    @Bean
    TimingAspect timingAspect() {
        return new TimingAspect();
    }
    
    @RequestMapping("/home")
    @ResponseBody
    String home() {
        perfBean.func();
        return "Hello World!";
    }
    
    public static void main(String[] args) {
        log.info("Hello slf4j log4j2.");
        SpringApplication.run(App.class,
                              args);
    }
}
