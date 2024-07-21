package com.jspider.assinment;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,3,5,7,9,3};
        System.out.println(Arrays.toString(odd(arr)));
    }
    static int[] odd(int [] arr)
    {
        int len=0;
        if (arr.length%2!=0)
        {
            len=arr.length/2;
        }
        else
        {
            len=arr.length/2;
        }
        int [] arr1 = new int[len];
        int index=0;
        for (int i =0;i<arr.length;i++)
        {
            if (i%2!=0)
            {
                arr1[index++]=arr[i];
            }
        }
        return arr1;
    }
}
