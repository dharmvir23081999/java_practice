package com.jspider.placement;


import java.util.Scanner;

public class UseJava8Features {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ente n =");
        int n = sc.nextInt();
        Thread t = new Thread(() ->
////            if (10 % 2 == 0) {
////                System.out.println("even");
////            } else {
////                System.out.println("odd");
////            }
//
      System.out.println((n%2==0)?"even":"odd"));

     t.start();
    }
}
