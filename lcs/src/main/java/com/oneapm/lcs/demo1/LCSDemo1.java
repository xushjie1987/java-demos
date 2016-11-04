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
    
    static class Result<R extends Comparable<R>, M, E extends Comparable<E>> implements Comparable<Result<R, M, E>> {
        R            length;
        M            min;
        M            max;
        Element<E>[] result;
        
        private Result(R length,
                       M min,
                       M max,
                       Element<E>[] result) {
            this.length = length;
            this.min = min;
            this.max = max;
            this.result = result;
        }
        
        static <R extends Comparable<R>, M, E extends Comparable<E>> Result<R, M, E> of(R length,
                                                                                        M min,
                                                                                        M max,
                                                                                        Element<E>[] result) {
            return new Result<R, M, E>(length,
                                       min,
                                       max,
                                       result);
        }
        
        @Override
        public int compareTo(Result<R, M, E> o) {
            return length.compareTo(o.length);
        }
    }
    
    static class LCS<N, E extends Comparable<E>, S, R extends Comparable<R>, M> {
        Node<N>[]       path;
        Element<E>[]    left;
        Element<E>[]    right;
        Result<R, M, E> result;
        
        public LCS(S l,
                   S r,
                   Function<S, Element<E>[]> turn,
                   Supplier<Node<N>[]> init) {
            this.path = init.get();
            this.left = turn.apply(l);
            this.right = turn.apply(r);
        }
        
        Element<E>[] getTheLongestCommonSubelementsFromTwoGroupElements() {
            Stream.of(left)
                  .forEach(l -> {
                      fillInPathVectorByLoop(l);
                  });
            return result.result;
        }
        
        void fillInPathVectorByLoop(Element<E> l) {
            Stream.of(right)
                  .forEach(r -> {
                      if (l.isCurrentTwoElementsEqual(r)) {
                          setThePathVectorPointToValueOfFrontValuePlusOne();
                      } else {
                          setThePathVectorPointToInitValue();
                      }
                      updateTheCurrentResultToGetTheMaxLengthOfSubElements();
                  });
        }
        
        void setThePathVectorPointToValueOfFrontValuePlusOne() {
            
        }
        
        void setThePathVectorPointToInitValue() {
            
        }
        
        void updateTheCurrentResultToGetTheMaxLengthOfSubElements() {
            Result<R, M, E> newResult = buildTheCurrentLengthResult();
            if (isTheNewLengthLongerThanCurrentResult(newResult)) {
                yesUpdateTheCurrentResult();
            } else {
                noNoNeedToUpdateTheCurrentResult();
            }
        }
        
        Result<R, M, E> buildTheCurrentLengthResult() {
            return null;
        }
        
        boolean isTheNewLengthLongerThanCurrentResult(Result<R, M, E> newResult) {
            return false;
        }
        
        void yesUpdateTheCurrentResult() {
            
        }
        
        void noNoNeedToUpdateTheCurrentResult() {
            
        }
    }
    
    public static void main(String[] args) {
        
    }
}
