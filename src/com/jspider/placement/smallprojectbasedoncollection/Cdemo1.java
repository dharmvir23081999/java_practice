package com.jspider.placement.smallprojectbasedoncollection;

import java.util.Arrays;

public class Cdemo1 {
    public static void main(String[] args) {
        String s = "abssvafwjwysava";
        char[] a = s.toCharArray();
        String res="";
        boolean [] arr = new boolean[26];

        for (char c : a)
        {
            if (!arr[c-'a'])
            {
                res=res+c;
                arr[c-'a']=true;
            }
        }
        System.out.println(res);
    }
}
