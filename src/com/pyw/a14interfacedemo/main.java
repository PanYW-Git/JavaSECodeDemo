package com.pyw.a14interfacedemo;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("小黑",6);
        System.out.println(dog.getName()+dog.getAge()+"，");
        dog.eat();
        dog.swimming();
    }
}
