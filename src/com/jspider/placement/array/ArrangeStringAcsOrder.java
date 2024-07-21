package com.jspider.placement.array;

import java.util.Arrays;

public class ArrangeStringAcsOrder

{
    public static void main(String[] args) {
        String [] a = {"baby","aman","david","anjali","svann","a"};
        int [] arr =new int[26];

        for (int i =0;i<a.length-1;i++)
        {
            for (int j = 0 ; j<a.length-1-i;j++)
            {
                if (a[j].length()>a[j+1].length())
                {
                    String temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }


}
