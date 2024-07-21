package com.jspider.placement;

import java.util.LinkedList;

public class Demo1 {
    public static void main(String[] args) {
        String s = "j257av21a18";
        m1(s);
    }
    static void m1(String s)
    {
        char[] a = s.toCharArray();
       int res=0;
        int num=0;
       for (int i = 0;i<a.length;i++)
       {

           if (a[i]>='0'&&a[i]<='9')
           {
               num=(num*10)+ a[i]-'0';
           }else {

               if (res<num)
               {
                   res=num;
                   num=0;
               }
           }
       }
        System.out.println(res);
    }
}
