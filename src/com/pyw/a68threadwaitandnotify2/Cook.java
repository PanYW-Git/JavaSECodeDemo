package com.pyw.a68threadwaitandnotify2;

import com.pyw.a67threadwaitandnotify.Desk;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

    ArrayBlockingQueue<String> queque;

    public Cook(ArrayBlockingQueue<String> queue){
        this.queque = queue;
    }

    @Override
    public void run() {

        while (true){
            //不断的把面条放到队列当中
            try {
                queque.put("面条");
                System.out.println("厨师放了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
