package com.pyw.a64threadmethod.threadmethod2;


public class ThreadDemo1 {
    public static void main(String[] args) {
        /*

            getPriority() 获取线程的优先级
            线程优先级为1~10 10优先级最高，1最低
            默认设置为5
            main线程的默认设置也为5
         */

        //创建线程要执行的参数对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t1 = new Thread(mr,"飞机");
        Thread t2 = new Thread(mr,"炸弹");

        //获取线程的优先级
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getPriority());

        //设置线程的优先级
        t1.setPriority(1);
        t2.setPriority(10);

        //炸弹
        t1.start();
        t2.start();
    }
}
