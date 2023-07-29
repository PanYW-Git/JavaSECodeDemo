package com.pyw.a69threadtest.test1;

public class MyThread extends Thread {

    static int ticket = 0;

    @Override
    public void run() {
        while (ticket < 1000) {
            synchronized (MyThread.class) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket++;
                System.out.println(getName()+"，当前卖出第" + ticket + "张票");
            }
        }
    }


}
