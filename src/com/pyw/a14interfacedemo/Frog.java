package com.pyw.a14interfacedemo;

public class Frog extends Animal {

    public Frog() {
    }

    public Frog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }


    public void swimming() {
        System.out.println("青蛙在游泳");
    }
}
