package com.pyw.a68threadwaitandnotify2;


import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            TODO 阻塞队列

            线程的6个状态
            新建状态（new） ——> 创建线程对象
            就绪状态（RUNNABLE） ——> start方法
            阻塞状态（BLOCKED） ——> 无法获得锁状态
            等待状态（WAITING） ——> wait方法
            计时等待（TIMED_WAITING） ——> sleep方法
            运行状态（JAVA虚拟机没有这个状态）
            结束状态（TERMINATED） ——> 全部代码运行完毕
         */
        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue(1);

        //创建线程的对象，把阻塞队列传递过去
        Cook c = new Cook(abq);
        Foodie f = new Foodie(abq);

        //设置名字
        c.setName("厨师");
        f.setName("吃货");

        //启动线程
        //输出结果与预期的不一致，应该是一个一次
        //这是由于输出语句在锁的外面造成的
        //只是看上去乱，但是实际的数据是没有影响的
        c.start();
        f.start();
    }
}
