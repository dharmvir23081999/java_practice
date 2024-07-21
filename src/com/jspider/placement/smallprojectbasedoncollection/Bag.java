package com.jspider.placement.smallprojectbasedoncollection;

public class Bag {
    private Fruit f;

    public Bag(Fruit f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "f=" + f +
                '}';
    }
}
