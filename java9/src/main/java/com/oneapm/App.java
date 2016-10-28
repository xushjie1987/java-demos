package com.oneapm;

import guru.nidi.graphviz.attribute.*;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.*;

import java.io.File;

/**
 * Hello world!
 */
public class App {
    static void graph1() {
        Graph g = Factory.graph("example")
                         .directed()
                         .node(Factory.node("a")
                                      .link(Factory.node("b")));
        Graphviz.fromGraph(g)
                .renderToFile(new File("1.png"));
    }

    static void graph2() {
        Node init = Factory.node("init"),
                execute = Factory.node("execute"),
                compare = Factory.node("compare")
                                 .attr(Shape.RECTANGLE,
                                       Style.FILLED,
                                       Color.hsv(.7,
                                                 .3,
                                                 1.0)),
                mkString = Factory.node("mkString")
                                  .attr(Label.of("make a\nstring")),
                printf = Factory.node("printf");

        Graph g = Factory.graph("example2")
                         .directed()
                         .node(Factory.node("main")
                                      .attr(Shape.RECTANGLE)
                                      .link(Factory.to(Factory.node("parse")
                                                              .link(execute))
                                                   .attr("weight",
                                                         8),
                                            Factory.to(init)
                                                   .attr(Style.DOTTED),
                                            Factory.node("cleanup"),
                                            Factory.to(printf)
                                                   .attr(Style.BOLD,
                                                         Label.of("100 times"),
                                                         Color.RED)),
                               execute.link(Factory.graph()
                                                   .node(mkString,
                                                         printf),
                                            Factory.to(compare)
                                                   .attr(Color.RED)),
                               init.link(mkString));

        Graphviz.fromGraph(g)
                .renderToFile(new File("2.png"));
    }

    static void graph3() {
        Node node0 = Factory.node("node0")
                            .attr(Records.of(Records.rec("f0",
                                                         ""),
                                             Records.rec("f1",
                                                         ""),
                                             Records.rec("f2",
                                                         ""),
                                             Records.rec("f3",
                                                         ""),
                                             Records.rec("f4",
                                                         ""))),
                node1 = Factory.node("node1")
                               .attr(Records.of(Records.turn(Records.rec("n4"),
                                                             Records.rec("v",
                                                                         "719"),
                                                             Records.rec("")))),
                node2 = Factory.node("node2")
                               .attr(Records.of(Records.turn(Records.rec("a1"),
                                                             Records.rec("805"),
                                                             Records.rec("p",
                                                                         "")))),
                node3 = Factory.node("node3")
                               .attr(Records.of(Records.turn(Records.rec("i9"),
                                                             Records.rec("718"),
                                                             Records.rec("")))),
                node4 = Factory.node("node4")
                               .attr(Records.of(Records.turn(Records.rec("e5"),
                                                             Records.rec("989"),
                                                             Records.rec("p",
                                                                         "")))),
                node5 = Factory.node("node5")
                               .attr(Records.of(Records.turn(Records.rec("t2"),
                                                             Records.rec("v",
                                                                         "959"),
                                                             Records.rec("")))),
                node6 = Factory.node("node6")
                               .attr(Records.of(Records.turn(Records.rec("o1"),
                                                             Records.rec("794"),
                                                             Records.rec("")))),
                node7 = Factory.node("node7")
                               .attr(Records.of(Records.turn(Records.rec("s7"),
                                                             Records.rec("659"),
                                                             Records.rec(""))));
        Graph g = Factory.graph("example3")
                         .directed()
                         .general()
                         .attr(RankDir.LEFT_TO_RIGHT)
                         .node(node0.link(Factory.between(Factory.loc("f0"),
                                                          node1.loc("v",
                                                                    Compass.SOUTH)),
                                          Factory.between(Factory.loc("f1"),
                                                          node2.loc(Compass.WEST)),
                                          Factory.between(Factory.loc("f2"),
                                                          node3.loc(Compass.WEST)),
                                          Factory.between(Factory.loc("f3"),
                                                          node4.loc(Compass.WEST)),
                                          Factory.between(Factory.loc("f4"),
                                                          node5.loc("v",
                                                                    Compass.NORTH))),
                               node2.link(Factory.between(Factory.loc("p"),
                                                          node6.loc(Compass.NORTH_WEST))),
                               node4.link(Factory.between(Factory.loc("p"),
                                                          node7.loc(Compass.SOUTH_WEST))));
        Graphviz.fromGraph(g)
                .renderToFile(new File("3.png"));
    }

    public static void main(String[] args) {
        graph1();
        graph2();
        graph3();
    }
}
