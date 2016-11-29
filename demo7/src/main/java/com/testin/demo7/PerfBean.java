/**
 * Project Name:demo7
 * File Name:PerfBean.java
 * Package Name:com.testin.demo7
 * Date:2016年11月29日下午11:38:15
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.testin.demo7;

import org.perf4j.aop.Profiled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ClassName:PerfBean <br/>
 * Function: <br/>
 * Date: 2016年11月29日 下午11:38:15 <br/>
 * 
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
@Component
public class PerfBean {
    static Logger log = LoggerFactory.getLogger(PerfBean.class);
    
    @Profiled(tag = "func")
    public void func() {
        try {
            System.out.println("Hello Perf4j");
            Thread.sleep(398L);
        } catch (Exception e) {
        }
    }
    
}
