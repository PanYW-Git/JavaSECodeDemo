package com.pyw.a11extendsdemo.ExtendsTest1;

public class Buyer extends AdminStaff{

    public Buyer() {
    }

    @Override
    public void doWork() {
        System.out.println("员工正在采购");
    }
}
