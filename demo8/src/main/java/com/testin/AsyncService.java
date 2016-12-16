/**
 * Project Name:demo8
 * File Name:AsyncService.java
 * Package Name:com.testin
 * Date:2016年12月15日下午10:18:13
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.testin;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * ClassName:AsyncService <br/>
 * Function: <br/>
 * Date: 2016年12月15日 下午10:18:13 <br/>
 * 
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
@Service
public class AsyncService {
    @Async
    public void fun() throws InterruptedException {
        System.out.println(Thread.currentThread()
                                 .getName() + "接收一个任务");
        Thread.sleep(Long.MAX_VALUE);
    }
}
