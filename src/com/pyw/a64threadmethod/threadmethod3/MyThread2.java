package com.pyw.a64threadmethod.threadmethod3;

public class MyThread2 extends Thread{

    public MyThread2() {
    }

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"---"+i);
        }
    }
}
