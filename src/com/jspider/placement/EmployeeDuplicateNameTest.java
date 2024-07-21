package com.jspider.placement;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private int id;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class EmployeeDuplicateNameTest {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Ram", 1, 50));
        employeeList.add(new Employee("Ram", 2, 35));
        employeeList.add(new Employee("Shyam", 3, 36));
        employeeList.add(new Employee("Shyam", 4, 25));//
        employeeList.add(new Employee("Shyam", 4, 35));
        employeeList.add(new Employee("Mohan", 4, 35));

        Map<String, List<Employee>> employeeWithDuplicateName = employeeList.stream()
                .filter(employee -> employee.getAge() > 30)
                .collect(Collectors.groupingBy(Employee::getName));

       // System.out.println("employeeWithDuplicateNameAndAgeGreaterThan30:"+employeeWithDuplicateNameAndAgeGreaterThan30);

        List<Employee> employeeWithDuplicateNameAndAgeGreaterThan30 = employeeWithDuplicateName.values().stream()
                .filter(empList -> empList.size() > 1)
                .flatMap(List:: stream)
                .toList();
                //.forEach(System.out::println);


       System.out.println("Employee:"+employeeWithDuplicateNameAndAgeGreaterThan30);

    }
}
