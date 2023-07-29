package com.pyw.a66threadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static int ticket = 0;

    //Lock是一个接口，需要new他的实现类
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //同步代码块
            //锁对象一定钥匙唯一的 一般都是用本文件的字节码对象，字节码是唯一的！
            //关锁
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                }
                Thread.sleep(10);
                //票没卖完
                ticket++;
                System.out.println(getName() + "正在卖" + ticket + "张票");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                //开锁
                //如果开锁放在上面，当循环到100时因为直接break就不会执行开锁
                //也可以在上面代码块和if判断中加开锁，但是代码写了两边
                //可以使用trycatch的finally一定会执行这个特性确保一定会开锁
                //以上也是最常规的写法
                lock.unlock();
            }
        }
    }
}
