package com.pyw.a69threadtest.test2;

public class ThreadTest1 {
    public static void main(String[] args) {
        /*
            TODO 有一百个礼物，三个人送出，礼物小于10个的时候就不要送了
            要求：用多线程模拟礼物送出过程
         */
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("人1");
        t2.setName("人2");
        t3.setName("人3");

        t1.start();
        t2.start();
        t3.start();
    }
}
