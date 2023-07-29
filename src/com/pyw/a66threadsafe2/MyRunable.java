package com.pyw.a66threadsafe2;

public class MyRunable implements Runnable{
    int ticket = 0;

    @Override
    public void run() {
        //1.循环
        while (true){
            //2.同步代码块
            if (method()) break;
        }

    }

    private synchronized boolean method() {
            if(ticket == 100){
                //3.到了末尾
                return true;
            }else {
                //4.没到末尾
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket++;
                System.out.println(Thread.currentThread().getName()+ "在卖第"+ticket+"张票");
            }
        return false;
    }
}
