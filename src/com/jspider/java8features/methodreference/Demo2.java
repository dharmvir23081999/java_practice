package com.jspider.java8features.methodreference;
interface B {
    Car getCar();
}
class Car{
    public void  run()
    {
        System.out.println("car is runnning");
    }
}

public class Demo2 {

    public static void main(String[] args) {
        B b = Car::new;

        Car c = b.getCar();
        c.run();
    }
}
