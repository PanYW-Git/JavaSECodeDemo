package com.pyw.a69threadtest.test2;

public class MyThread extends Thread {

    static int gift = 100;

    static int allGift = gift;

    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if(gift <= 10){
                    break;
                }else {
                    gift --;
                    System.out.println(getName()+"送出了第"+(allGift - gift)+"份礼物,还剩余"+gift+"份礼物");
                }
            }
        }
    }


}
