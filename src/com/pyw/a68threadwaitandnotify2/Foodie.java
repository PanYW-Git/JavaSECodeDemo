package com.pyw.a68threadwaitandnotify2;


import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {

    ArrayBlockingQueue<String> queque;

    public Foodie(ArrayBlockingQueue<String> queue){
        this.queque = queue;
    }

    @Override
    public void run() {
        while (true){
            //不断的从阻塞队列中获取面条
            try {
                String take = queque.take();
                System.out.println(take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
