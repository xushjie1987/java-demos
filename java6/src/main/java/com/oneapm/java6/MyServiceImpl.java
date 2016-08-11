/**
 * Project Name:java6
 * File Name:MyServiceImpl.java
 * Package Name:com.oneapm.java6
 * Date:2016年8月11日上午10:35:36
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.java6;

/**
 * ClassName:MyServiceImpl <br/>
 * Function: <br/>
 * Date: 2016年8月11日 上午10:35:36 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class MyServiceImpl implements MyService {
    
    /**
     * Creates a new instance of MyServiceImpl.
     */
    public MyServiceImpl() {
        System.out.println("MyServiceImpl is instanted.");
    }
    
    /**
     * @see com.oneapm.java6.MyService#process()
     */
    @Override
    public String process() {
        return "hello service loader";
    }
    
}
