package com.pyw.a63createthread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
            多线程的第三种实现方式
                特点：可以获取到多线程的运行结果

                1.创建一个MyCallable实现Callable接口
                2.重写call（是有返回值的，表示多线程运行的结果）

                3.创建MyCallable的对象（表示多线程要执行的任务）
                4.创建FutreTask的对象（作用管理多线程运行的结果）
                5.创建Thread类的对象，并启动（表示线程）
         */

        //创建MyCallable的对象（表示多线程要执行的任务）
        MyCallable mc = new MyCallable();
        //创建FutreTask的对象（作用管理多线程运行的结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建Thread类的对象，并启动（表示线程）
        Thread t1 = new Thread(ft);
        //启动线程
        t1.start();

        //获取多线程运行的结果
        Integer sum = ft.get();
        System.out.println("多线程运行的结果"+sum);
    }
}
