package com.pyw.a71mythreadpool2;

import java.util.concurrent.*;

public class MyThreadPoolDemo1 {
    public static void main(String[] args) {
    /*
        //TODO 自定义线程池

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
        (核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略);

        参数一：核心线程数量              不能小于0
        参数二：最大线程数                不能小于0，最大数量 >= 核心线程数量
        参数三：空闲线程最大存活时间       不能小于0
        参数四：时间单位                  用TimeUnit指定
        参数五：任务队列                  不能为null
        参数六：创建线程工厂              不能为null
        参数七：任务的拒绝策略             不能为null
    */

        //1.创建自定义线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,//核心线程数量，不能小于0
                6,//最大线程数，不能小于0，且>=核心线程数量
                60,//空闲线程最大存活时间
                TimeUnit.SECONDS, //空闲线程最大存活时间时间单位 用TimeUnit指定
                new ArrayBlockingQueue<>(3),//阻塞队列，指定长度ArrayBlockingQueue 不指定长度LinkedBlockingQueue
                Executors.defaultThreadFactory(),//创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()//任务拒绝策略,拒绝策略是静态内部类，所以使用new 类名.内部类创建 超过最大线程数如何处理？一般选择拒绝服务并且抛出异常
        );

        //提交任务
//        threadPoolExecutor.submit(任务1);
//        threadPoolExecutor.submit(任务2);
//        threadPoolExecutor.submit(任务3);
    }
}
