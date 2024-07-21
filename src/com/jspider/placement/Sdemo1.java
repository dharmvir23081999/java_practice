package com.jspider.placement;

public class Sdemo1 {
    public static void main(String[] args) {
        String s = "abaabbccccklm";
        m1(s);
    }
    static void m1(String s)
    {
        String res = "";
        char [] a = s.toCharArray();
        int i=0;
        int count =0 ;
        char m = 'a';
        while (i<a.length)
        {
            char c = a[i];
            int temp=0;
            while (i<a.length&&c==a[i])
            {
                i++;
                temp++;
            }
            if (temp>count)
            {
                count=temp;
                m=a[i];
            }

        }
        for (int j =0 ;j<a.length;j++)
        {
            if (a[j]==m)
            {
                res=res+m+"";
            }else {
                res=res+a[j]+"";
            }
        }
        System.out.println(res);
    }
}
