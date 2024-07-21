package com.jspider.placement.smallprojectbasedoncollection;

import java.util.Arrays;

public class Savan1 {
    public static void main(String[] args) {
       String s= "abc@123@aam*jkdgf";
       char[]a=s.toCharArray();
       String[] arr = new String[5];
       int i =0;
        String temp="";
       for (char c : a)
       {
           if (Character.isAlphabetic(c)||Character.isDigit(c))
           {
               temp+=c;
           }else{
               arr[i++]=temp;
               temp="";
           }
       }
       arr[i] =temp;
       String res ="";
      for (char c : a)
      {
          if (Character.isAlphabetic(c)||Character.isDigit(c)){}
          else {
              res+=arr[i--]+c;
          }
      }
        System.out.println(res+arr[i]);
    }
}
