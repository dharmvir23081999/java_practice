package com.jspider.placement.array;

import java.util.Arrays;

public class AddUniqueStringFromTwoArray {
    public static void main(String[] args) {
        String [] a ={"hari","james","rahul","hari"};
        String [] b={"farooq","shyam","james"};
        String s  = "";
        for (String s1 : a){
            if (!s.contains(s1))
                s=s+s1+" ";

        }
        for (String s2 : b)
        {
            if (!s.contains(s2))
                s= s+s2+" ";
        }
        String [] c = s.split(" ");
        System.out.println(Arrays.toString(c));
    }
}
