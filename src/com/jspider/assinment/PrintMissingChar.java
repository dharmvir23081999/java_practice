package com.jspider.assinment;

public class PrintMissingChar {
    public static void main(String[] args) {
        String s = "zabc";
        char[] a= s.toCharArray();
        int[] arr = new int[26];
        for (char c:a)
        {
            arr[c-'a']++;
        }
        char c ='a';
        String ss ="";
        for (int i =0;i<arr.length;i++){
            if (arr[i]==0){
                ss=ss+c;
            }
            c++;
        }
        System.out.println(ss);
    }
}
