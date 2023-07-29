package com.pyw.a65threadsafe1;

public class ThreadDemo {
    /*
        需求：
            某电影院目前正在上映大片，一共一百张票，三个窗口售卖，请设计一个程序模拟
     */
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }



}
