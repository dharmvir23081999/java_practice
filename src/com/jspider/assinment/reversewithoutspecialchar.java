package com.jspider.assinment;

public class reversewithoutspecialchar {
    public static void main(String[] args) {
        String s = "&abD*ka@d*";
        char[] a= s.toCharArray();
        reverse(a);
        System.out.println("2nd:---"+new String(a));
        System.out.println(reverse(s));
    }
    static String reverse(String s)
    {
        char[] a= s.toCharArray();
        int i =0,j=a.length-1;
        while (i<j)
        {
            if (a[i]>='a'&&a[i]<='z'&&a[j]<='z'&&a[j]>='a')
            {
                char temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            } else if (!(a[i]>='a'&&a[i]<='z')) {
                i++;
            }
            else j--;
        }
        return new String(a);
    }
    public static void reverse(char str[])
    {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;

        // Traverse string from both ends until 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;

                // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
}
