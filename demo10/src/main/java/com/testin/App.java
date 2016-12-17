package com.testin;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
    
    @SuppressWarnings("unchecked")
    public void test() throws IOException {
        DruidDataSource record = druidDataSourceMapper.selectByPrimaryKey("payfee");
        System.out.println(new String(record.getCommitMetadataPayload()));
        System.out.println(mapper.writeValueAsString(record));
        Map<String, Object> m = mapper.readValue(new String(record.getCommitMetadataPayload()),
                                                 Map.class);
        System.out.println(Objects.toString(m));
    }
    
    public static void main(String[] args) throws InterruptedException, IOException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class,
                                                                                  args);
        App app = applicationContext.getBean(App.class);
        app.test();
        Thread.sleep(Long.MAX_VALUE);
    }
}
