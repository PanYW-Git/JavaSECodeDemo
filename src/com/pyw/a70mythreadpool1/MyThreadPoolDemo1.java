package com.pyw.a70mythreadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo1 {
    public static void main(String[] args) throws InterruptedException {
    /*
        public static ExecutorService newCachedThreadPool()             创建一个没有上限的线程池
        public static ExecutorService newFixedThreadPool (int nThreads) 创建有上限的线程池
    */

        //1.获取线程池对象
        //没有上线
        ExecutorService pool1 = Executors.newCachedThreadPool();
        //有上线 参数中填的三个
        ExecutorService pool2 = Executors.newFixedThreadPool(3);

        //2.没有上线的线程池提交任务
        pool1.submit(new MyRunnable());
        //暂停0.1秒为了让程序把线程还回线程池，他就可以反复调用了不用创建新的线程
        Thread.sleep(100);
        pool1.submit(new MyRunnable());
        Thread.sleep(100);
        pool1.submit(new MyRunnable());
        Thread.sleep(100);
        pool1.submit(new MyRunnable());
        Thread.sleep(100);
        pool1.submit(new MyRunnable());
        Thread.sleep(100);
        pool1.submit(new MyRunnable());

        Thread.sleep(3000);

        //2.有上线的线程池提交任务
        System.out.println("===========================");
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());

        //3.销毁线程池 线程池一般不销毁
//        pool1.shutdown();

    }
}
