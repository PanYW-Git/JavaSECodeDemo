package com.pyw.a69threadtest.test1;

public class ThreadTest1 {
    public static void main(String[] args) {
        /*
            TODO 一共有一千张电影票，假设每次领取时间为3000ms
            要求：用多线程模拟卖票过程并打印剩余电影票的数量
         */
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}
