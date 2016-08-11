/**
 * Project Name:java6
 * File Name:ServiceLoaderMain.java
 * Package Name:com.oneapm.java6
 * Date:2016年8月11日上午10:37:28
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.java6;

import java.util.ServiceLoader;

/**
 * ClassName:ServiceLoaderMain <br/>
 * Function: <br/>
 * Date: 2016年8月11日 上午10:37:28 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class ServiceLoaderMain {
    
    /**
     * main: <br/>
     * @author xushjie
     * @param args
     * @since JDK 1.7
     */
    public static void main(String[] args) {
        ServiceLoader<MyService> loader = ServiceLoader.load(MyService.class);
        for (MyService s : loader) {
            System.out.println(s.process());
        }
    }
    
}
