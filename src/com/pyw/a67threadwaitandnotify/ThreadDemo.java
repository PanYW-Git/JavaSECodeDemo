package com.pyw.a67threadwaitandnotify;

public class ThreadDemo {
    public static void main(String[] args) {
        //TODO 等待唤醒机制（生产者和消费者） 基本写法
        Cook c = new Cook();
        Foodie f = new Foodie();

        //设置名字
        c.setName("厨师");
        f.setName("吃货");

        //启动线程
        c.start();
        f.start();
    }
}
