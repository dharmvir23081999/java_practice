package com.jspider.assinment;

public class Fabo {
    public static void main(String[] args) {
        int a=0,b=1;
        int c;
        for (int i =0 ;i<10;i++)
        {
            c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
    }
}
