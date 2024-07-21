package com.jspider.placement;

public class Demo10 {
    public static void main(String[] args) {
        System.out.println(sum(2836352,0));
    }
    static int sum(int n,int sum)
    {
        if (n==0) return  sum;
        int rem = n%10;

        sum+=rem;
        n/=10;
         return sum(n,sum);


    }
}
