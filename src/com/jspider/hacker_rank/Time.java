package com.jspider.hacker_rank;

public class Time {
    public static void main(String[] args) {
        String time ="12:45:10am";
        System.out.println(timeConversion(time));
        System.out.println(time.substring(0,2));

    }
    public static String timeConversion(String s) {
        if ("pm".equals(s.substring(8))) {
            int a = 12 + Integer.parseInt(s.substring(0, 2));
            return a + ":" + s.substring(3, 8);
        } else if (12 == Integer.parseInt(s.substring(0, 2)) && 0 <= Integer.parseInt(s.substring(3, 5))) {
            int c = 12 - Integer.parseInt(s.substring(0, 2));
            return c+":"+ s.substring(3, 8);
        } else {
            int b = Integer.parseInt(s.substring(0, 2));
            return b + ":" + s.substring(3, 8);
        }



    }
}
