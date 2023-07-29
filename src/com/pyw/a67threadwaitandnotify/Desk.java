package com.pyw.a67threadwaitandnotify;


/*
    作用：控制生产者和消费者的执行
 */
public class Desk {
    /**
     * 座子上是否有面条
     *  0：没有面条
     *  1：有面条
     */
    public static int fooFlag = 0;

    /**
     * 总个数
     * 控制吃货最多可以吃多少
     */
    public static int count = 10;

    /**
     * 锁对象
     */
    public static Object lock = new Object();
}
