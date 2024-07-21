package com.jspider.java8features.functionalinterface;

import javax.print.DocFlavor;
import java.util.function.*;

public class Demo2 {
    public static void main(String[] args) {
        predicate();
        function();
        consumer();
        supplier();

        biPredicate();
        biFunction();
        biConsumer();
    }
    static void predicate()
    {
        Predicate<Integer> p =(n)->{
            for (int  i = 2;i<= n/2;i++)
            {
                if (n%i==0) return false;
            }
            return true;

        };

        System.out.println(p.test(4));
    }

    static void function()
    {
        Function<Integer , Integer> f = (n)->n+4;

        System.out.println(f.apply(20));

    }

    static void consumer()
    {
        Consumer<Integer> c = (n)->{
            String s = n%2==0?"even":"odd";
            System.out.println(s);
        };

        c.accept(3);
    }

    static void supplier()
    {
        Supplier<Integer> s = ()->{ return 20;};
        System.out.println(s.get());
    }

    static void biPredicate()
    {
        BiPredicate predicate = (a,b)->{
            return a==b;
        };
        System.out.println(predicate.test(4,4));
    }

    static void biFunction()
    {
        BiFunction<Integer,Integer,Integer> biFunction = (a,b)->
        {
            return a+b;
        };
        System.out.println(biFunction.apply(4,6));
    }

    static void biConsumer()
    {
        BiConsumer <Integer,Integer> biConsumer =(a,b)-> System.out.println(a+b);
        biConsumer.accept(6,8);
    }
}
