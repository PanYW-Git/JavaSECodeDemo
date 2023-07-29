package com.pyw.a14interfacedemo;

public class Dog extends Animal implements Swimming{

    public Dog() {
    }

    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    @Override
    public void swimming() {
        System.out.println("狗在游泳");
    }
}
