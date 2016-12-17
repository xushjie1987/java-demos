/**
 * Project Name:demo9
 * File Name:MyService.java
 * Package Name:com.testin.demo9
 * Date:2016年12月16日上午9:23:28
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.testin.demo9;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * ClassName:MyService <br/>
 * Function: <br/>
 * Date: 2016年12月16日 上午9:23:28 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
@Service
public class MyService {
    @Async
    public void fun() throws InterruptedException {
        System.out.println(Thread.currentThread()
                                 .getName());
        Thread.sleep(Long.MAX_VALUE);
    }
}
