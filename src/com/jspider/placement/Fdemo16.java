package com.jspider.placement;

public class Fdemo16 {
    public static void main(String[] args) {
        int n = 45;
        isPalindrome(n, n, 0);
    }

    static void isPalindrome(int n, int m,int res) {

        if (n == 0) {
            if (res == m) {
                System.out.println(res+"is palindrome");
                return;
            } else {
                System.out.println(res+"is not palindrome");
                return;
            }
        }
        res = (res * 10) + n % 10;
        isPalindrome(n / 10, m,res);

    }
}

