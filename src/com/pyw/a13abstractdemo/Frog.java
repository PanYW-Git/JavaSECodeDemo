package com.pyw.a13abstractdemo;

public abstract class Frog extends Animal{

    public Frog() {
    }

    public Frog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }
}
