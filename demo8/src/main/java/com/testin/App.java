package com.testin;

import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 */
// @EnableAsync
// @Configuration
@SpringBootApplication
// @ComponentScan(basePackages = {"com.testin"})
public class App /* implements AsyncConfigurer */{
    @Autowired
    private AsyncService asyncService;
    
    public void test() throws InterruptedException {
        asyncService.fun();
        System.out.println("抛出任务1");
        asyncService.fun();
        System.out.println("抛出任务2");
        asyncService.fun();
        System.out.println("抛出任务3");
        asyncService.fun();
        System.out.println("抛出任务4");
        asyncService.fun();
        System.out.println("抛出任务5");
        asyncService.fun();
        System.out.println("抛出任务6");
    }
    
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class,
                                                                                  args);
        Executor exe = applicationContext.getBean(Executor.class);
        System.out.println(exe.toString());
        App app = applicationContext.getBean(App.class);
        app.test();
        System.out.println("4个任务全部抛出");
        Thread.sleep(Long.MAX_VALUE);
    }
    
    // @Override
    // public Executor getAsyncExecutor() {
    // // ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
    // // executor.setRejectedExecutionHandler(new CallerRunsPolicy());
    // ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    // executor.setCorePoolSize(2);
    // executor.setMaxPoolSize(2);
    // executor.setQueueCapacity(1);
    // executor.setThreadNamePrefix("MyExecutor-");
    // executor.initialize();
    // System.out.println("Hello getAsyncExecutor");
    // return executor;
    // }
    //
    // @Override
    // public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
    // return new AsyncUncaughtExceptionHandler() {
    //
    // @Override
    // public void handleUncaughtException(Throwable arg0,
    // Method arg1,
    // Object... arg2) {
    // System.out.println("Uncaught: " + arg1.getName());
    // }
    // };
    // }
}
