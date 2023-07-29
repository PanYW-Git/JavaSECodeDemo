package com.pyw.a69threadtest.test3;

public class MyThread extends Thread {

    static int i = 1;

    @Override
    public void run() {

        while (true){
            synchronized (MyThread.class) {
                if(i>100){
                    break;
                }
                if (i % 2 == 1) {
                    System.out.println(i);
                }
                i++;
            }
        }


    }
}
