/**
 * Project Name:java4
 * File Name:ElasticMain.java
 * Package Name:com.oneapm.java4
 * Date:2016年8月8日下午5:42:58
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.java4;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.action.admin.indices.stats.IndicesStatsResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

/**
 * ClassName:ElasticMain <br/>
 * Function: <br/>
 * Date: 2016年8月8日 下午5:42:58 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class ElasticMain {
    
    /**
     * main: <br/>
     * @author xushjie
     * @param args
     * @throws UnknownHostException
     * @since JDK 1.7
     */
    public static void main(String[] args) throws UnknownHostException {
        //
        Settings settings = Settings.settingsBuilder()
                                    .put("cluster.name",
                                         "xintest")
                                    .build();
        //
        Client client = TransportClient.builder()
                                       .settings(settings)
                                       .build()
                                       .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.128.7.243"),
                                                                                           9300));
        //
        IndicesStatsResponse response = client.admin()
                                              .indices()
                                              .prepareStats("monitor-2016-08-*")
                                              .setSearch(true)
                                              .get();
        System.out.println(response.toString());
    }
    
}
