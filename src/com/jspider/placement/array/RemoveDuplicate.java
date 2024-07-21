package com.jspider.placement.array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] a= {2,3,6,2,6,8,3,6,2,5,9};
        int smallest = Integer.MAX_VALUE;
        for (int n : a)
        {
            if (smallest>n)
                smallest=n;
        }
        System.out.println(smallest);
        for (int i =0;i<a.length-1;i++)
        {
            if (a[i]==a[i+1])
                a[i]=smallest-1;
        }
        System.out.println(Arrays.toString(a));
    }
}
