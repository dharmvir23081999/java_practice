package com.jspider.placement.smallprojectbasedoncollection;

public class Cdemo4 {
    public static void main(String[] args) {
        String s ="bbbbbbbb";
        char [] a = s.toCharArray();
        String res="";
        String temp ="";

       for (int i =0;i<s.length();i++)
       {

           if (!temp.contains(a[i]+"")){
               temp = temp+a[i];
           }else {
               if (res.length()<temp.length())
               {
                   res=temp;

               }
               temp="";
           }
       }
        System.out.println(res.length());
    }
}
