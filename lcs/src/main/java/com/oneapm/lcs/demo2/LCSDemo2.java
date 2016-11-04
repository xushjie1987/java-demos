/**
 * Project Name:lcs
 * File Name:LCSDemo2.java
 * Package Name:com.oneapm.lcs.demo2
 * Date: 
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.oneapm.lcs.demo2;

/**
 * ClassName:LCSDemo2 <br/>
 * Function: <br/>
 * Date: <br/>
 * 
 * @author hadoop
 * @version
 * @since JDK 1.8
 * @see
 */
public class LCSDemo2 {
    
    static String lcs(String s1,
                      String s2) {
        int min = 0;
        int max = 0;
        int length = 0;
        String result = "";
        int[] path = new int[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    path[j] = j == 0
                                    ? 1
                                    : path[j - 1] + 1;
                }
                if (length < path[j]) {
                    length = path[j];
                    max = j;
                }
            }
        }
        min = max - length + 1;
        result = length == 0
                            ? ""
                            : (String) s2.subSequence(min,
                                                      max + 1);
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(lcs("hello",
                               "xhxexllxo"));
    }
    
}
