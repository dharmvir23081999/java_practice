package com.jspider.placement;

public class Demo17 {
    public static void main(String[] args) {
        String s ="alla";
        char [] a= s.toCharArray();
        System.out.println(isPalindrome(a,0,a.length-1 ));
    }

    static boolean isPalindrome(char[]a,int i,int j )
    {
        if (i>j) return true;

        if (a[i]!=a[j])
            return false;
        i++;
        j--;
        return isPalindrome(a,i,j);
    }


}
