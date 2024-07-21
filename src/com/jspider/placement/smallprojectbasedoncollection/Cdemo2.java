package com.jspider.placement.smallprojectbasedoncollection;

import java.util.Arrays;

public class Cdemo2 {
    public static void main(String[] args) {
        int[][] a = new int [5][];
        int r=0,c=0;
        char dir ='d';
        int data=1;
        for (int i =0;i<a.length;i++)
        {
            a[i]= new int[i+1];
        }
        while (c<a.length)
        {
            switch (dir)
            {
                case 'd':

                    a[r][c]=data++;
                    if (r==a.length-1)
                    {
                        dir='u';
                        c++;
                        break;
                    }
                    r++;
                    break;


                case 'u':

                    a[r][c]=data++;
                    if (r==c){
                        dir='d';
                        r++;

                        c++;
                        break;
                    }
                    r--;
                    break;


            }
        }

        for (int[] n :a)
        {
            for (int m : n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
