package com.jspider.placement;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringClassMethod {
    public static void main(String[] args) {
        String s =" Program";
        String s1 = "java is an opps lang";
        System.out.println(s.toString());
        System.out.println(s.getBytes(StandardCharsets.UTF_8));
        System.out.println(s.getBytes());
        System.out.println(s.toLowerCase(Locale.ROOT));
        System.out.println(s.toLowerCase());
        System.out.println(s.compareTo("jakajghjadg"));
        System.out.println(s.chars());
        System.out.println(s.valueOf(2));
        System.out.println();
    }
}
