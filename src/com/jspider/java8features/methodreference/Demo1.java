package com.jspider.java8features.methodreference;
interface A
{
    void m1();
}
public class Demo1 {

    public void run()
    {
        System.out.println("run method implimentation");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();

        A a = d::run;
        a.m1();
    }


}
