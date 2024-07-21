package com.jspider.java8features.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();

        l.add(20);
        l.add(15);
        l.add(40);
        l.add(10);
        l.add(50);

        System.out.println(l);

        Collections.sort(l,(o1,o2)-> o2-o1);
        System.out.println(l);
    }
}
