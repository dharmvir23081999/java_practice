package com.jspider.placement.smallprojectbasedoncollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        boolean flage = true;
        while (flage)
        {
            System.out.println("1.add the fruit \n"+"2.remove the fruit \n"+"3.search the fruit \n"+"4.no of fruit in bag \n"+"5.exit");

            System.out.println("------choose the option-----------");
            Scanner sc = new Scanner(System.in);
            System.out.print("select the option:-");

            int num = sc.nextInt();

            switch (num){
                case 1:
                {
                    System.out.print("enter fruit name=");
                    String name = sc.next();
                    System.out.println();
                    System.out.print("enter fruit test=");
                    String test = sc.next();
                    fruits.add( new Fruit(name,test));
                    System.out.println("fruit add successfully");
                    break;

                }
                case 2:
                {
                    System.out.print("remove fruit name = ");
                    String name = sc.next();
                 if (fruits.size()>0)
                 {
                     for (int i = 0;i<fruits.size();i++)
                     {

                         Fruit f = fruits.get(i);
                         if (f.getName().equals(name))
                         {
                             fruits.remove(f);

                         }
                         else {
                             System.out.println(name+" is not present in bag");
                         }
                     }

                 }else {
                     System.out.println("no any fruit present");
                 }
                    break;
                }
                case 3:
                {
                    System.out.print("enter fruit name = ");
                    String name = sc.next();
                    for (int i =0;i<fruits.size();i++)
                    {
                        Fruit f = fruits.get(i);
                        if (f.getName().equals(name)){
                            System.out.println("fruit name= "+f.getName()+"test ="+f.getTest()+" is present");
                            break;
                        }

                    }
                    System.out.println("fruit is not present");
                    break;
                }
                case 4:
                {
                    System.out.println("total no of fruit = "+fruits.size());
                    for (int i =0;i<fruits.size();i++)
                    {
                        System.out.println(fruits.get(i));
                    }
                    break;
                }
                case 5:
                {
                    flage = false;
                }

            }
        }
    }
}
