/**
 * Project Name:lcs
 * File Name:LCSDemo1.java
 * Package Name:com.oneapm.lcs.demo1
 * Date: 
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.oneapm.lcs.demo1;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * ClassName:LCSDemo1 <br/>
 * Function: <br/>
 * Date: <br/>
 * 
 * @author xushjie
 * @version
 * @since JDK 1.8
 * @see
 */
public class LCSDemo1 {
    static class Node<N> {
        N t;
        
        public Node(N t) {
            this.t = t;
        }
        
        void increment(Node<N> inc,
                       BiFunction<N, N, N> bi) {
            t = bi.apply(t,
                         inc.t);
        }
    }
    
    static class Element<E extends Comparable<E>> {
        Optional<E> e;
        
        public Element(E e) {
            this.e = Optional.ofNullable(e);
        }
        
        boolean isCurrentTwoElementsEqual(Element<E> other) {
            return (e.isPresent() && other.e.isPresent())
                                                         ? (e.get()
                                                             .compareTo(other.e.get()) == 0
                                                                                           ? true
                                                                                           : false)
                                                         : false;
        }
    }
    
    static class LCS<N, E extends Comparable<E>, S> {
        Node<N>[]    path;
        Element<E>[] left;
        Element<E>[] right;
        
        public LCS(S l,
                   S r,
                   Function<S, Element<E>[]> turn,
                   Supplier<Node<N>[]> init) {
            this.path = init.get();
            this.left = turn.apply(l);
            this.right = turn.apply(r);
        }
        
        Element<E> getTheLongestCommonSubelementsFromTwoGroupElements() {
            Stream.of(left)
                  .forEach(l -> {
                      fillInPathVectorByLoop(l);
                  });
            return null;
        }
        
        void fillInPathVectorByLoop(Element<E> l) {
            Stream.of(right)
                  .forEach(r -> {
                      if (l.isCurrentTwoElementsEqual(r)) {
                          
                      }
                  });
        }
    }
    
    public static void main(String[] args) {
        
    }
}
