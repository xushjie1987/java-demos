package com.testin.demo4;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.moment.Variance;

import com.glassdoor.planout4j.planout.ops.random.RandomInteger;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

/**
 * Hello world!
 */
public class App {
    static void forPlanout() {
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("min",
                 1);
        args.put("max",
                 100);
        args.put("unit",
                 "hello");
        args.put("salt",
                 "salt");
        System.out.println(new RandomInteger(args).eval());
    }
    
    static void forGuava() {
        Long l = Long.parseLong(Hashing.sha1()
                                       .hashString("null" + "." + "salt" + "." + "hello",
                                                   Charset.forName("UTF-8"))
                                       .toString()
                                       .substring(0,
                                                  15),
                                16);
        System.out.println(1 + l % 100);
    }
    
    public static void main(String[] args) {
        forPlanout();
        forGuava();
        // withVariancePlanout();
        // withVarianceGuava();
        compare();
    }
    
    static Long forPlanout(String salt) {
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("min",
                 1);
        args.put("max",
                 100);
        args.put("unit",
                 "hello");
        args.put("salt",
                 salt);
        Long l = new RandomInteger(args).eval();
        return l;
    }
    
    static void withVariancePlanout() {
        double[] s = new double[100];
        for (int i = 0; i < 1000000; i++) {
            Long l = forPlanout(UUID.randomUUID()
                                    .toString());
            s[l.intValue() - 1] += 1;
        }
        StandardDeviation sd = new StandardDeviation();
        System.out.println("variance: " + sd.evaluate(s));
    }
    
    static Long forGuava(String salt) {
        Long l = Long.parseLong(Hashing.sha1()
                                       .hashString("null" + "." + salt + "." + "hello",
                                                   Charset.forName("UTF-8"))
                                       .toString()
                                       .substring(0,
                                                  15),
                                16);
        return 1 + (l % 100000) / 1000;
    }
    
    static void withVarianceGuava() {
        double[] s = new double[100];
        for (int i = 0; i < 1000000; i++) {
            Long l = forPlanout(UUID.randomUUID()
                                    .toString());
            s[l.intValue() - 1] += 1;
        }
        StandardDeviation sd = new StandardDeviation();
        System.out.println("variance: " + sd.evaluate(s));
    }
    
    static void compare() {
        double[] f = new double[100];
        double[] s = new double[100];
        for (int i = 0; i < 1000000; i++) {
            String r = UUID.randomUUID()
                           .toString();
            Long l = forPlanout(r);
            f[l.intValue() - 1] += 1;
            l = forGuava(r);
            s[l.intValue() - 1] += 1;
        }
        StandardDeviation sd = new StandardDeviation();
        System.out.println("variance: " + sd.evaluate(f));
        System.out.println("variance: " + sd.evaluate(s));
    }
    
}
