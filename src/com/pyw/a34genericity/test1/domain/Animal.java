package com.pyw.a34genericity.test1.domain;


public abstract class Animal {
    private String name;
    private Integer age;

    public Animal() {
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public abstract void eat();
}
