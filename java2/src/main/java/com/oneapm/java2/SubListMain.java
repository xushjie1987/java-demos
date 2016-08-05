/**
 * Project Name:java2
 * File Name:SubListMain.java
 * Package Name:com.oneapm.java2
 * Date:2016年8月4日下午1:53:08
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

/**
 * ClassName:SubListMain <br/>
 * Function: <br/>
 * Date: 2016年8月4日 下午1:53:08 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class SubListMain {
    
    /**
     * main: <br/>
     * @author xushjie
     * @param args
     * @since JDK 1.7
     */
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>(Arrays.asList("a",
                                                             "b",
                                                             "c",
                                                             "d",
                                                             "e"));
        List<String> s = l.subList(0,
                                   2);
        System.out.println(l.size()); // 5
        System.out.println(s.size()); // 2
        l.stream()
         .peek(System.out::println)
         .count();
        List<List<String>> ll = ListUtils.partition(l,
                                                    3);
        for (List<String> list : ll) {
            System.out.println(list.size());
        }
        l.clear();
        for (List<String> list : ll) {
            System.out.println(list.size());
        }
    }
}
