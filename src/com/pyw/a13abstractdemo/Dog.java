package com.pyw.a13abstractdemo;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

}
