package com.jspider.placement;

import java.util.Arrays;

public class Arrrayy {
    public static void main(String[] args) {
        int[] a={1,0,1,0,1,0,1,1,1};
        int i =0;
        for (int n : a)
        {
            if (n>0)
                a[i++]=n;
        }

        while (i<a.length)
        {
            a[i++]=0;
        }

        System.out.println(Arrays.toString(a));
    }
}
