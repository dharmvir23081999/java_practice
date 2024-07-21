package com.jspider.placement;

import java.util.Arrays;

public class Demo9 {
    public static void main(String[] args) {
        int [] a ={2,5,4,9,7,2,5,7,9,3};
        int n =2;
        System.out.println(longest(a,n));
    }
    static int longest(int[] a, int n )
    {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
       //System.out.println(a[a.length-1]);

        int j =0;
        for (int i =0;i<a.length-1;i++)
        {
            if (a[i]!=a[i+1])
            {
                a[j]=a[i];
                j++;
            }


        }
        a[j]=a[a.length-1];
         j++;
        for (int i=j;i<a.length;i++)
        {
            a[i]=0;
        }
        Arrays.sort(a);

        return a[a.length-n];
    }
}
