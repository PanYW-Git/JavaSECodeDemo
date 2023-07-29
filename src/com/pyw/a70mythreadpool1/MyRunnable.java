package com.pyw.a70mythreadpool1;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}
