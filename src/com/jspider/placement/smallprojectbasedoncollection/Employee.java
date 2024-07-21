package com.jspider.placement.smallprojectbasedoncollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"ram",20));
        list.add(new Employee(102,"savan",23));
        list.add(new Employee(12,"saurabh",33));
        list.add(new Employee(33,"sahil",12));

       // Comparator<Employee> c = (o1,o2)-> {return o1.id-o2.id;};

        Collections.sort(list, (o1,o2)-> {return o1.id-o2.id;});

        for (Employee e: list)
        {
            System.out.println(e);
        }
    }

}
