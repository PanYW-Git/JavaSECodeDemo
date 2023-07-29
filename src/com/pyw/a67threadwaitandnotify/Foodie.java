package com.pyw.a67threadwaitandnotify;

public class Foodie extends Thread {
    @Override
    public void run() {
        /*
            1.循环
            2.同步代码块
            3.判断共享数据是否到了末尾（到了）
            4.判断共享数据是否到了末尾（没到，执行核心逻辑）
         */
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    //先判断桌子上是否有面条
                    if (Desk.fooFlag == 0) {
                        //没有就等待
                        try {
                            Desk.lock.wait();//让当前线程跟锁进行绑定
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //把吃的总数-1
                        Desk.count--;
                        //有就开吃
                        System.out.println("吃货正在吃面条，还能再吃" + Desk.count + "碗");
                        //吃完之后唤醒厨师继续做,唤醒Desk.lock上的所有线程
                        Desk.lock.notifyAll();
                        //修改桌子的状态
                        Desk.fooFlag = 0;
                    }
                }
            }
        }
    }
}
