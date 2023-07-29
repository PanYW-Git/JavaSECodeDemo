package com.pyw.a34genericity.test1.domain;

public class BossCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的,"+getAge()+"岁的波斯猫，正在吃东西");
    }
}
