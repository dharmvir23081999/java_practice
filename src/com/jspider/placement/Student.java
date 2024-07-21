package com.jspider.placement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Student {
    int id ;
    String name;
    String add;

    public Student(int id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
//class  CompAdd implements Comparator<Student>
//{
//
//    @Override
//    public int compare(Student o1, Student o2) {
//      //return   o1.add.length()-o2.add.length();
//      // return  (o1.add.compareTo(o2.add)) ;
//        return o1.id-o2.id;
//    }
//}
class Drive{
    public static void main(String[] args) {
        Student s1 = new Student(2, "savan", "delhi");
        Student s2 = new Student(1, "rahul", "bangalore");
        Student s3 = new Student(3, "rani", "patna");
        Student s4 = new Student(5, "pankaj", "gaya");
        Student s5 = new Student(4, "raju", "chana");


        Student[] a = {s1, s2,s3,s4,s5};
        List<Student> l = new ArrayList<>();
        for (Student s: a)
        {
            l.add(s);

        }
        for (Student m : l){
            System.out.println(m);
        }
        System.out.println("_____________");
        Arrays.sort(a,(o1,o2)-> o1.add.compareTo(o2.add));
       for (Student n :a)
       {
           System.out.println(n);
       }
    }
}
