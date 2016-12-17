/**
 * Project Name:demo10
 * File Name:MapperScannerConfigure.java
 * Package Name:com.testin
 * Date:2016年12月16日下午6:39:48
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.testin;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:MapperScannerConfigure <br/>
 * Function: <br/>
 * Date: 2016年12月16日 下午6:39:48 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
@Configuration
@AutoConfigureAfter(SqlSessionConfigure.class)
public class MapperScannerConfigure {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.testin.mapper");
        return mapperScannerConfigurer;
    }
}
