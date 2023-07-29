package com.pyw.a34genericity.test1.domain;

import com.pyw.a34genericity.test1.domain.Dog;

public class TidiDog extends Dog {
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的,"+getAge()+"岁的泰迪狗，正在吃东西");
    }
}
