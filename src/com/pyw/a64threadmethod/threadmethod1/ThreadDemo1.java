package com.pyw.a64threadmethod.threadmethod1;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        /*
            TODO String getName()                    返回此线程的名称
            TODO void setName(String name)           设置线程的名字（构造方法也可以设置名字）
            细节：
                1.如果没有给线程设置名字，线程也有默认名，
                    格式：Thread-x(x:序号，从0开始的)
                2.如果要给线程设置线程名，可以set方法设置也可以构造方法设置
                    注：构造方法设置因为是子类，需要在子类的构造传给父类的构造方法设置

            static Thread currentThread()       获取当前线程的对象
            细节：
                当JVM虚拟机启动之后，会自动的启动多条线程
                其中有一条线程叫做main线程
                他的作用就是去调用main方法，并执行里面的代码
                在以前，我们写的所有代码，其实都是运行在main线程当中

            static void sleep（long time） 让线程休眠指定的时间，单位为毫秒
            细节：
                1.哪条线程执行刀这个方法，那么哪条线程就会在这里停留对应的时间
                2.方法的参数：表示睡眠的时间，单位毫秒 1s = 1000ms
                3.当时间到了之后，线程会自动醒来执行下面的其他代码

         */

        //1.创建线程的对象
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("炸弹");

        //2.开启线程
        t1.start();
        t2.start();

        //currentThread
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);//获取线程名称，main方法独有的main线程

        //sleep
        System.out.println("111111");
        Thread.sleep(5000);
        System.out.println("222222");
    }
}
