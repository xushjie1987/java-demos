package com.testin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testin.domain.DruidDataSource;
import com.testin.mapper.DruidDataSourceMapper;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    static final ObjectMapper     mapper = new ObjectMapper();
    @Autowired
    private DruidDataSourceMapper druidDataSourceMapper;
    
    public void test() throws JsonProcessingException {
        DruidDataSource record = druidDataSourceMapper.selectByPrimaryKey("payfee");
        System.out.println(new String(record.getCommitMetadataPayload()));
        System.out.println(mapper.writeValueAsString(record));
    }
    
    public static void main(String[] args) throws InterruptedException, JsonProcessingException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class,
                                                                                  args);
        App app = applicationContext.getBean(App.class);
        app.test();
        Thread.sleep(Long.MAX_VALUE);
    }
}
