package com.jspider.placement;

import java.util.Scanner;

public class FindLenghtWithoutLenfgth {
    public static void main(String[] args) {
        String s ="savan is very lucy";
        m1(s);
        Scanner sc = new Scanner(s);

      sc=  sc.useDelimiter("");
        int c=0;
        while (sc.hasNext())
        {
            c++;
            sc.next();
        }

        System.out.println(c);
    }

    static void m1(String s)
    {
        Scanner sc = new Scanner(s);
        String res="";
        sc = sc.useDelimiter(" ");
        int c=0;
        while (sc.hasNext())
        {
            String s1=sc.next();
            if (res.length()<s1.length())
            {
                res = s1;
            }
        }
        System.out.println(res);
    }
}
