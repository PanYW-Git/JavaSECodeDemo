package com.pyw.a65threadsafe1;

public class MyThread extends Thread{

    static int ticket = 0;


    static Object obj = new Object();

    @Override
    public void run() {
        while (true){
            //同步代码块
            //锁对象一定钥匙唯一的 一般都是用本文件的字节码对象，字节码是唯一的！
            synchronized (MyThread.class){
                if(ticket < 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //票没卖完
                    ticket++;
                    System.out.println(getName()+"正在卖"+ticket+"张票");
                }else {
                    break;
                }
            }

        }
    }
}
