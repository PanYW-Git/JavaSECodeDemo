package com.pyw.a69threadtest.test6demo2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

    ArrayList<Integer> arrayList;

    public MyThread() {
    }

    public MyThread(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        //1.循环
        //2.同步代码块
        //3.判断到末尾
        //4.判断没到末尾
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                if (arrayList.size() == 0) {
                    int sum = boxList.stream().reduce(0, (a, b) -> a + b);
                    System.out.println("在此次抽奖过程中，" +
                            getName() + "总共产生了" + boxList.size() + "个奖项。" +
                            "分别为：" + boxList.toString() + "" +
                            "最高奖项为" + Collections.max(boxList) + "元，" +
                            "总计额为" + sum + "元");
                    break;
                } else {
                    Collections.shuffle(arrayList);
                    Integer integer = arrayList.remove(0);
                    System.out.println(integer);
                    boxList.add(integer);
                }
            }
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
