package com.pyw.a69threadtest.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
            TODO 线程结果比较
            有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
            创建两个抽奖箱(线程)设置线程名称分别为    "抽奖箱1", "抽奖箱2"
            随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:

            在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：10,20,100,500,2,300
        	    最高奖项为300元，总计额为932元

            在此次抽奖过程中，抽奖箱2总共产生了6个奖项，分别为：5,50,200,800,80,700
            	最高奖项为800元，总计额为1835元

            在此次抽奖过程中,抽奖箱2中产生了最大奖项,该奖项金额为800元

            核心逻辑：获取线程抽奖的最大值（看成是线程运行的结果）

            以上打印效果只是数据模拟,实际代码运行的效果会有差异
        */
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,10,5,20,50,100,200,500,800,2,80,300,700);

        MyCallable mc1 = new MyCallable(arrayList);

        FutureTask<Integer> ft1 = new FutureTask<>(mc1);
        FutureTask<Integer> ft2 = new FutureTask<>(mc1);


        Thread mt1 = new Thread(ft1);
        Thread mt2 = new Thread(ft2);

        mt1.setName("抽奖箱1");
        mt2.setName("抽奖箱2");

        mt1.start();
        mt2.start();

        int t1Max = ft1.get();
        int t2Max = ft2.get();
        String maxName = mt1.getName();
        int max = t1Max;
        if(t1Max < t2Max){
            maxName = mt2.getName();
            max = t2Max;
        }

        System.out.println("最大抽奖在"+maxName+"产生，的最大值为"+max);
    }
}
