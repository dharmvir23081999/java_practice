package com.jspider.placement;

public class Demo23 {
    public static void main(String[] args) {
        m1();
        int n = 5;
        int bin=0;
        int i=1;
        while (n>0)
        {
            int bit = n%2;
            bin = (bit*i)+bin;
            i = i*10;
            n/=2;
        }
        System.out.println(bin);
    }
    static void m1()
    {
        int n = 101;
        int i=1;
        int dec = 0;
        while (n>0)
        {
            int bit = n%10;
            dec = (bit*i)+dec;
            i = i*2;
            n/=10;
        }
        System.out.println(dec);
    }
}
