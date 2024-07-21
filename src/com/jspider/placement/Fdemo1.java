package com.jspider.placement;

public class Fdemo1 {
    public static void main(String[] args) {
        String s =" java is is java an oop an lang";
        String res="";
        String [] a= s.split(" ");
        for (String n:a)
        {
            if (!res.contains(n))
                res+=n+" ";
        }
        System.out.println(res.trim());
    }
}
