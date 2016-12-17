package com.testin.demo9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.task.TaskExecutor;

/**
 * Hello world!
 */
// @Configuration
// @EnableAsync
@SpringBootApplication
public class App
//
// implements AsyncConfigurer
//
{
    @Autowired
    private MyService    xxxxxxx;
    
    @Autowired(required = false)
    private TaskExecutor executor;
    
    public void test() throws InterruptedException {
        xxxxxxx.fun();
        xxxxxxx.fun();
        xxxxxxx.fun();
        xxxxxxx.fun();
        xxxxxxx.fun();
    }
    
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class,
                                                                                  args);
        System.out.println(applicationContext.containsBean("taskExecutor"));
        System.out.println(applicationContext.containsBean("executor"));
        App app = applicationContext.getBean(App.class);
        app.test();
        Thread.sleep(Long.MAX_VALUE);
    }
    
    // @Override
    // public Executor getAsyncExecutor() {
    // ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    // executor.setCorePoolSize(7);
    // executor.setMaxPoolSize(42);
    // executor.setQueueCapacity(11);
    // executor.setThreadNamePrefix("MyExecutor-");
    // executor.initialize();
    // return executor;
    //
    // }
    //
    // @Override
    // public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
    // return null;
    // }
}
