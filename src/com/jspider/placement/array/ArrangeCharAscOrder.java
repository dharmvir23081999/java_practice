package com.jspider.placement.array;

import java.util.Arrays;

public class ArrangeCharAscOrder {
    public static void main(String[] args) {
        char[] a = {'B','A','D','E','C'};
        int [] arr = new int[26];
        for (char c : a)
        {
            arr[c-'A']++;
        }
        int j =0;
        for (int i =0;i<arr.length;i++)
        {
            while (arr[i]>0){
                a[j++]=(char)(i+'A');
                arr[i]--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
