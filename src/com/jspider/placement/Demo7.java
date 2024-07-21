package com.jspider.placement;

public class Demo7 {
    public static void main(String[] args) {
        String s ="abssabbbbbbkkkddd";
        char[] a= s.toCharArray();
        String res="";
        int [] a1 = new int[26];
    int max=0;
        for (char c :a)
        {
            a1[c-'a']++;

        }
        int count =0;
        char ch =' ';
        for (int i =0;i<a.length;i++) {
            if (a1[a[i] - 'a'] >count) {
                count = a1[a[i] - 'a'];
                ch=a[i];
            }
        }
        for (int i =0;i<a.length;i++)
        {
            if (ch==a[i])
            {
                res=res+'@';
            }else res = res+a[i];
        }

        System.out.println(res);


    }
}
