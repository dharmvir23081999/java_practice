package com.jspider.placement;

public class Demo4 {
    public static void main(String[] args) {
        String s = "java is an opp language";
        char [] a=s.toCharArray();

        int count=0;
        String res="";
        String temp="";
        int i =0;
        while (i<a.length)
        {
            while (i<a.length&&a[i]!=' ')
            {
                temp=temp+a[i];
                i++;
            }
           if (count<temp.length())
           {
               res=temp;
               count=temp.length();

           }
           temp="";
           i++;
        }
        System.out.println(res);


    }
}
