/**
 * Project Name:demo9
 * File Name:MyConfigure.java
 * Package Name:com.testin.demo9
 * Date:2016年12月16日上午9:20:31
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.testin.demo9;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * ClassName:MyConfigure <br/>
 * Function: <br/>
 * Date: 2016年12月16日 上午9:20:31 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
@Configuration
@EnableAsync
public class MyConfigure implements AsyncConfigurer {
    
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(7);
        executor.setMaxPoolSize(42);
        executor.setQueueCapacity(11);
        executor.setThreadNamePrefix("MyExecutor-");
        executor.initialize();
        System.out.println("Hello getAsyncExecutor");
        return executor;
        
    }
    
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
    
}
