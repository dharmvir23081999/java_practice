package com.jspider.placement.smallprojectbasedoncollection;

public class Fruit {

    private String name;
    private String test;

    public Fruit(String name, String test) {
        this.name = name;
        this.test = test;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", test='" + test + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
