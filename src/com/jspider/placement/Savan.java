package com.jspider.placement;

import java.util.LinkedList;

public class Savan {
    public static void main(String[] args) {
     String s = "ab";
     String temp ="";
     String res = "";
    if (s.length()>1)
    {
        for (int i =0;i<s.length()-1;i++)
        {
            for (int j = i;j<s.length();j++){

                if (ispalindrome(s,i,j))
                {
                    temp=s.substring(i,j+1);
                }
                if (res.length()<temp.length())
                    res=temp;

                temp="";
            }
        }
        System.out.println(res);

    }
       else System.out.println(s);

    }
    static boolean ispalindrome(String s , int i,int j )
    {
        while (i<=j)
        {
            if (s.charAt(i)!=s.charAt(j)) return false;

            i++;
            j--;
        }
        return true;
    }
}
