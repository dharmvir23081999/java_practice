package com.jspider.placement.smallprojectbasedoncollection;

public class Savan2 {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    static int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            int rem = x % 10;
            ans = ans * 10 + rem;
            x /= 10;
        }

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) ans;
        }
    }
}