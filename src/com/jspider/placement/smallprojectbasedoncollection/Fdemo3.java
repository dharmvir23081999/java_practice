package com.jspider.placement.smallprojectbasedoncollection;

public class Fdemo3 {
    public static void main(String[] args) {
        int [] a ={3,4,4,2,2,2,3,3,3,3,5,5,5,5,5,5};
        int temp=0;
        int res=0;
        int i =0;
        while (i<a.length)
        {
            int count =0;
            int n = a[i];
            while (i<a.length&&n==a[i])
            {
                count++;
                i++;
            }
            if (count>temp)
            {
                temp=count;
                res=n;
            }
        }
        System.out.println(res);
    }
}
