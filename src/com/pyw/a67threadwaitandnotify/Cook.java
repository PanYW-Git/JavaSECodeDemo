package com.pyw.a67threadwaitandnotify;

public class Cook extends Thread{

    @Override
    public void run() {
        /*
            1.循环
            2.同步代码块
            3.判断共享数据是否到了末尾（到了末尾）
            4.判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）
         */
        while (true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    //3.判断共享数据是否到了末尾（到了末尾）
                    break;
                }else {
                    //4.判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）
                    if(Desk.fooFlag == 1){
                        //如果有就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        //没有就做饭，然后修改食物状态
                        Desk.fooFlag = 1;
                        System.out.println("厨师做了一份饭放在桌子上，吃货还能吃"+Desk.count);
                        //叫醒等待的消费者开吃
                        Desk.lock.notifyAll();
                    }


                }
            }
        }
    }
}
