package com.jspider.placement;

import java.util.Iterator;
import java.util.TreeMap;

public class Fdemo4 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> m =  new TreeMap<>();


        m.put(1,4);
        m.put(2,6);
        m.put(3,55);
        m.put(4,23);
        m.put(5,34);

        int max =0;
        Iterator<Integer> i = m.keySet().iterator();
        while (i.hasNext())
        {
            Integer key = i.next();
            if (max<m.get(key))
                max=m.get(key);
        }
        System.out.println(max);
    }
}
