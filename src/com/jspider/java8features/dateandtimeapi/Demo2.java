package com.jspider.java8features.dateandtimeapi;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(24);
        list.add(54);
        list.add(64);
        list.add(74);


        list.forEach((i)-> System.out.println(i));
    }
}
