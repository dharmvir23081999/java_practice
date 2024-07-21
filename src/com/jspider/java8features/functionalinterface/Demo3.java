package com.jspider.java8features.functionalinterface;

import java.util.function.IntFunction;

public class Demo3 {
    public static void main(String[] args) {
        IntFunction<Integer> function = (n)->n+4;

        System.out.println(function.apply(10));

    }
}
