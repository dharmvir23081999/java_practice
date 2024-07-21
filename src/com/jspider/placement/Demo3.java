package com.jspider.placement;

import javax.swing.*;

public class Demo3 {
    public static void main(String[] args) {
        int n =5;
        for(int i =1;i<=n;i++)
        {
            for (int j = 1 ;j<i;j++)
            {
                System.out.print(" "+" ");
            }
            for (int j = n;j>=i;j--)
            {
                if (i==1)
                {
                    System.out.print(j+" ");
                } else if (j==n) {
                    System.out.print(j+" ");

                }else System.out.print(" "+" ");
            }
            for (int j =i+1;j<=n;j++)
            {
                if (i==1){
                    System.out.print(j+" ");
                } else if (j==n) {
                    System.out.print(j+" ");


                }else System.out.print(" "+" ");
            }
            System.out.println();
        }


    }

}
