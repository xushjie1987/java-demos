package com.oneapm.test1;

import java.util.ArrayList;
import java.util.List;

import org.apache.flink.api.common.functions.RichFlatMapFunction;
import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.api.java.functions.KeySelector;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.windowing.RichAllWindowFunction;
import org.apache.flink.streaming.api.windowing.windows.GlobalWindow;
import org.apache.flink.util.Collector;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test1() throws Exception {
        StreamExecutionEnvironment see = StreamExecutionEnvironment.getExecutionEnvironment();
        see.fromElements("hello",
                         "world",
                         "china",
                         "japan")
           .map(new RichMapFunction<String, Tuple4<String, Integer, Integer, String>>() {
               private static final long serialVersionUID = 1L;
               
               @Override
               public Tuple4<String, Integer, Integer, String> map(String value) throws Exception {
                   return Tuple4.of(value,
                                    0,
                                    0,
                                    value.substring(0,
                                                    1));
               }
           })
           .countWindowAll(2)
           .apply(new RichAllWindowFunction<Tuple4<String, Integer, Integer, String>, List<Tuple4<String, Integer, Integer, String>>, GlobalWindow>() {
               private static final long serialVersionUID = -817759445226440207L;
               
               @Override
               public void apply(GlobalWindow window,
                                 Iterable<Tuple4<String, Integer, Integer, String>> values,
                                 Collector<List<Tuple4<String, Integer, Integer, String>>> out) throws Exception {
                   final List<Tuple4<String, Integer, Integer, String>> result = new ArrayList<Tuple4<String, Integer, Integer, String>>();
                   values.forEach(t -> {
                       result.add(t);
                   });
                   result.forEach(nt -> {
                       nt.f2 = result.size();
                   });
                   out.collect(result);
               }
           })
           .print();
        see.execute();
    }
    
    @Test
    public void test2() throws Exception {
        StreamExecutionEnvironment see = StreamExecutionEnvironment.getExecutionEnvironment();
        see.setParallelism(4)
           .fromElements("hello",
                         "world",
                         "china",
                         "japan")
           .map(new RichMapFunction<String, Tuple4<String, Integer, Integer, String>>() {
               private static final long serialVersionUID = 1L;
               
               @Override
               public Tuple4<String, Integer, Integer, String> map(String value) throws Exception {
                   return Tuple4.of(value,
                                    0,
                                    0,
                                    value.substring(0,
                                                    1));
               }
           })
           .countWindowAll(2)
           .apply(new RichAllWindowFunction<Tuple4<String, Integer, Integer, String>, List<Tuple4<String, Integer, Integer, String>>, GlobalWindow>() {
               private static final long serialVersionUID = -817759445226440207L;
               
               @Override
               public void apply(GlobalWindow window,
                                 Iterable<Tuple4<String, Integer, Integer, String>> values,
                                 Collector<List<Tuple4<String, Integer, Integer, String>>> out) throws Exception {
                   final List<Tuple4<String, Integer, Integer, String>> result = new ArrayList<Tuple4<String, Integer, Integer, String>>();
                   values.forEach(t -> {
                       result.add(t);
                   });
                   result.forEach(nt -> {
                       nt.f2 = result.size();
                   });
                   out.collect(result);
               }
           })
           .flatMap(new RichFlatMapFunction<List<Tuple4<String, Integer, Integer, String>>, Tuple4<String, Integer, Integer, String>>() {
               private static final long serialVersionUID = 1L;
               
               @Override
               public void flatMap(List<Tuple4<String, Integer, Integer, String>> value,
                                   Collector<Tuple4<String, Integer, Integer, String>> out) throws Exception {
                   value.forEach(t -> out.collect(t));
               }
           })
           .keyBy(new KeySelector<Tuple4<String, Integer, Integer, String>, String>() {
               private static final long serialVersionUID = -4492887056880890563L;
               
               @Override
               public String getKey(Tuple4<String, Integer, Integer, String> value) throws Exception {
                   return value.f3;
               }
           })
           .map(new RichMapFunction<Tuple4<String, Integer, Integer, String>, Tuple4<String, Integer, Integer, String>>() {
               private static final long serialVersionUID = 6587325269764699667L;
               
               @Override
               public Tuple4<String, Integer, Integer, String> map(Tuple4<String, Integer, Integer, String> value) throws Exception {
                   System.out.println("number of this parallel subtask: " +
                                      getRuntimeContext().getIndexOfThisSubtask() +
                                      ", the parallelism with which the parallel task runs: " +
                                      getRuntimeContext().getNumberOfParallelSubtasks());
                   return value;
               }
           })
           .setParallelism(4)
           .print()
           .setParallelism(4);
        see.execute();
    }
}
