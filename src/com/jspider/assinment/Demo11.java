package com.jspider.assinment;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo11 {
    public static void main(String[] args) {
        int [] a={3,2,4,5,3,7,11,2,13};
        ArrayList ar = new ArrayList<>();
        for (int i =0;i<a.length;i++)
        {
            if (a[i]%2!=0)
            {
                ar.add(a[i]);
            }
        }
        System.out.println(ar);
    }
}
