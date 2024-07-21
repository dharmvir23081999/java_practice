package com.jspider.java8features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(4);
        list.add(12);

       Stream<Integer> stream= list.stream();

      List<Integer> list1= stream.filter((i)-> i%2==0).collect(Collectors.toList());

        System.out.println(list1);

        Integer min = list.stream().min((a1,a2)->a1-a2).get();
        Integer max = list.stream().max((a1,a2)->a1-a2).get();
        System.out.println(min);
        System.out.println(max);

       List list2= list.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);

        list.stream().map((a)->a*2).collect(Collectors.toList()).forEach(System.out::println);
    }

}
