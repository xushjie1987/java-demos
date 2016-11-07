/**
 * Project Name:lcs
 * File Name:Demo5.java
 * Package Name:com.oneapm.lcs.demo5
 * Date: 
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.oneapm.lcs.demo5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ClassName:Demo5 <br/>
 * Function: <br/>
 * Date: <br/>
 * 
 * @author hadoop
 * @version
 * @since JDK 1.8
 * @see
 */
public class Demo5 {
    public static void main(String[] args) {
        String x = "a1b2c3";
        String y = "1a1wbz2c123a1b2c123";
        int substringLength1 = x.length();
        int substringLength2 = y.length();
        int[][] opt = new int[substringLength1 + 1][substringLength2 + 1];
        for (int i = substringLength1 - 1; i >= 0; i--) {
            for (int j = substringLength2 - 1; j >= 0; j--) {
                if (x.charAt(i) == y.charAt(j))
                    opt[i][j] = opt[i + 1][j + 1] + 1;
                else
                    opt[i][j] = Math.max(opt[i + 1][j],
                                         opt[i][j + 1]);
            }
            System.out.println("=====================" + i + "=====================");
            Stream.of(opt)
                  .forEach(os -> {
                      IntStream.of(os)
                               .forEach(System.out::print);
                      System.out.println();
                  });
        }
        System.out.print("LCS:");
        int i = 0, j = 0;
        while (i < substringLength1 && j < substringLength2) {
            if (x.charAt(i) == y.charAt(j)) {
                System.out.print(x.charAt(i));
                i++;
                j++;
            } else if (opt[i + 1][j] >= opt[i][j + 1])
                i++;
            else
                j++;
        }
    }
}
