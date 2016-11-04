/**
 * Project Name:lcs
 * File Name:Demo4.java
 * Package Name:com.oneapm.lcs.demo4
 * Date: 
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.oneapm.lcs.demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * ClassName:Demo4 <br/>
 * Function: <br/>
 * Date: <br/>
 * 
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
public class Demo4 {
    String       l;
    String       r;
    
    List<String> result = new ArrayList<String>();
    int          max    = 0;
    int[]        path;
    
    void lcs() {
        path = new int[r.length()];
        for (int i = 0; i < l.length(); i++) {
            // 从后向前依次对照，从前向后则不行
            for (int j = r.length() - 1; j >= 0; j--) {
                // 如果对应字符相同
                if (l.charAt(i) == r.charAt(j)) {
                    path[j] = (j == 0
                                     ? 0
                                     : path[j - 1]) + 1;
                    // 最长长度记录没有打破
                    if (path[j] == max) {
                        result.add(r.subSequence(j - max + 1,
                                                 j + 1)
                                    .toString());
                    }
                    // 打破了最长记录
                    if (path[j] > max) {
                        max = path[j];
                        result.clear();
                        result.add(r.subSequence(j - max + 1,
                                                 j + 1)
                                    .toString());
                    }
                } else {
                    // 如果对应字符不匹配，则直接置为0
                    path[j] = 0;
                }
            }
            // 打印一些中间过程
            System.out.println("===第" + i + "次===");
            IntStream.of(path)
                     .forEach(System.out::print);
            System.out.println();
            print();
        }
    }
    
    void print() {
        result.forEach(System.out::println);
    }
    
    public Demo4(String l,
                 String r) {
        this.l = l;
        this.r = r;
    }
    
    public static void main(String[] args) {
        Demo4 d = new Demo4("hello",
                            "hexellox");
        d.lcs();
        System.out.println("最终的结果：");
        d.print();
    }
}
