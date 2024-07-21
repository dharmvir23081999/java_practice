package com.jspider.placement.smallprojectbasedoncollection;

public class Cdemo3 {
    public static void main(String[] args) {
        String s = "@ab$kl*k";
        System.out.println(res(s));
    }
    public static String res(String s)
    {char [] a= s.toCharArray();
        int i =0,j=a.length-1;
        while (i<j)
        {
            char c = a[i];
            char d= a[j];
            if (c>='a'&&c<='z')
            {
                if (d>='a'&&d<='z')
                {
                    char temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i++;
                    j--;
                }else j--;
            }else i++;
        }
        return  new String(a);
    }
}
