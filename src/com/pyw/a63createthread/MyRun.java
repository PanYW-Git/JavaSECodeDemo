package com.pyw.a63createthread;

public class MyRun implements Runnable {
    @Override
    public void run() {
        //书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            //获取当前线程的对象
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+"helloword");
        }
    }
}
