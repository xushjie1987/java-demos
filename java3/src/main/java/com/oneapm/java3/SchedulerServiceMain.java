/**
 * Project Name:java3
 * File Name:SchedulerServiceMain.java
 * Package Name:com.oneapm.java3
 * Date:2016年8月8日下午5:20:36
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.java3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ClassName:SchedulerServiceMain <br/>
 * Function: <br/>
 * Date: 2016年8月8日 下午5:20:36 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class SchedulerServiceMain {
    
    /**
     * main: <br/>
     * @author xushjie
     * @param args
     * @since JDK 1.7
     */
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(10);
        // ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(() -> {
                                          System.out.println("1: " +
                                                             Thread.currentThread()
                                                                   .getName());
                                          try {
                                              Thread.sleep(2000);
                                          } catch (Exception e) {
                                              e.printStackTrace();
                                          }
                                          System.out.println("1: " +
                                                             Thread.currentThread()
                                                                   .getName());
                                      },
                                      0,
                                      5,
                                      TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(() -> {
                                          System.out.println("2: " +
                                                             Thread.currentThread()
                                                                   .getName());
                                          try {
                                              Thread.sleep(2000);
                                          } catch (Exception e) {
                                              e.printStackTrace();
                                          }
                                          System.out.println("2: " +
                                                             Thread.currentThread()
                                                                   .getName());
                                      },
                                      0,
                                      5,
                                      TimeUnit.SECONDS);
        // scheduler.shutdown();
    }
    
}
