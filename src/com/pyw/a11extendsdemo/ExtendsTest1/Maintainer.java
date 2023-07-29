package com.pyw.a11extendsdemo.ExtendsTest1;

public class Maintainer extends AdminStaff{

    @Override
    public void doWork() {
        System.out.println("员工正在修空调");
    }
}
