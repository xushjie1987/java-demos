/**
 * Project Name:java5
 * File Name:GenericMain.java
 * Package Name:com.oneapm.java5
 * Date:2016年8月9日下午1:04:24
 * Copyright (c) 2016, All Rights Reserved.
 *
 */

package com.oneapm.java5;

import java.util.List;

/**
 * ClassName:GenericMain <br/>
 * Function: <br/>
 * Date: 2016年8月9日 下午1:04:24 <br/>
 * @author xushjie
 * @version
 * @since JDK 1.7
 * @see
 */
public class GenericMain {
    
    public static class A {
        
        List<String>  l;
        
        List<Integer> i;
        
        // 编译报错：
        // Erasure of method A(List<String>) is the same as another method in type GenericMain.A
        // public A(List<String> l) {
        // this.l = l;
        // }
        
        public A(List<Integer> i) {
            this.i = i;
        }
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
