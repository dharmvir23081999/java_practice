package com.jspider.assinment;

public class Demo10 {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,3,2,8,22};
        int s1 = a[0];
        int s2=a[0];
        for (int i =1;i<a.length;i++)
        {
            if (s1<a[i])
            {
                s2=s1;
                s1=a[i];
            }
            else if (s2<a[i]||s2==s1)
            {
                s2=a[i];
            }

        }
        System.out.println(s2);
    }
}
