package com.jspider.placement;

public class CountEachChar {
    public static void main(String[] args) {
        String s = "banana";

        char[] a= s.toCharArray();
        int[] a1= new int[26];
        for (char c: a)
        {
            a1[c-'a']++;
        }
        for(int i =0;i<a1.length;i++)
        {
            if (a1[i]>0)
            {
                int k = i+'a';
                char c = (char)k;
                System.out.println(c+"="+a1[i]);
            }
        }
    }
}
