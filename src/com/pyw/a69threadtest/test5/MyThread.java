package com.pyw.a69threadtest.test5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{

    ArrayList<Integer> arrayList;

    public MyThread(){}

    public MyThread(ArrayList<Integer> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        //1.循环
        //2.同步代码块
        //3.判断到末尾
        //4.判断没到末尾
        while (true){
            synchronized (MyThread.class){
                if(arrayList.size() == 0){
                    break;
                }else {
                    Collections.shuffle(arrayList);
                    Integer integer = arrayList.remove(0);
                    System.out.println(getName() + "又产生了一个"+integer+"元大奖");
                }
            }
        }
    }
}
