package com.pyw.a63createthread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        /*
            TODO 多线程的第一种启动方式：

                1、自己定义一个类继承Thread
                2、重写run方法
                3、创建子类的对象，并启动线程
         */
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        //设置线程名称
        mt1.setName("线程1");
        mt2.setName("线程2");

        //开启线程 不可以直接调用run方法，调用run方法等于直接调用一个方法

        mt1.start();
        mt2.start();
    }
}
