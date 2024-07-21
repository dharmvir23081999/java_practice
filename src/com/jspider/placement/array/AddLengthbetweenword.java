package com.jspider.placement.array;

public class AddLengthbetweenword {
    public static void main(String[] args) {
        String s = "i am in jsp student";
        m1(s);
        System.out.println("_____________________");
        String[] arr = s.split(" ");
        String res ="";
        for (int i =0; i<arr.length;i++)
        {
            for (int j =0;j<arr[i].length();j++)
            {
                if (j==arr[i].length()/2)
                    res = res + arr[i].length();
                res = res + arr[i].charAt(j);

            }
            res = res + " ";
        }
        System.out.println(res);
    }

    public  static void m1(String s ){
        char [] a = s.toCharArray();
        int i =0, j =0;
        String res ="";
        int m =0;

        while (i<a.length)
        {
            String temp = "";
            int count = 0;
            while (i<a.length&&a[i]!=' ')
                i++;
            int p = i;
            while (j<p)
            {
                temp = temp+a[j++];
                count++;
            }
            // i am in jsp student
            System.out.println(temp+" "+count);

            for (int k =0;k<temp.length();k++)
            {
                if (k==count/2)
                    res = res+count;

                res = res+temp.charAt(k);
            }
            m++;
            res = res+" ";
            i++;
            j=i;

        }
        System.out.println(res);

    }
}
