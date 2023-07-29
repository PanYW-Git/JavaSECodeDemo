package com.pyw.a66threadsafe2;

public class ThreadDemo {
    /*
        需求：
            某电影院目前正在上映大片，一共一百张票，三个窗口售卖，请设计一个程序模拟
            利用同步方法完成
     */
    public static void main(String[] args) {
        MyRunable mr = new MyRunable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }



}
