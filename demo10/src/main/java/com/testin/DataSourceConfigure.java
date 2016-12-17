/**
 * Project Name:demo10
 * File Name:DataSourceConfigure.java
 * Package Name:com.testin
 * Date:2016年12月16日下午6:27:39
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.testin;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * ClassName:DataSourceConfigure <br/>
 * Function: <br/>
 * Date: 2016年12月16日 下午6:27:39 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
@Configuration
public class DataSourceConfigure {
    
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://10.10.32.32:3306/demo?useUnicode=true&amp;characterEncoding=UTF-8",
                                                                         "root",
                                                                         "testin");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }
    
}
