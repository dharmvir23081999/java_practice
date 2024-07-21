package com.jspider.placement;
public class Fdemo2 {
    public static void main(String[] args) {
        int[] a = {2, 3, 2, 5, 4, 3, 6, 7, 3, 2, 1, 3, 5, 3};
        int[] a1 = new int[10];
        int count = 0;

        for (int n : a) {
            a1[n]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a1[a[i]] > count)
                count = a[i];
        }
        System.out.println(count);
    }
}
