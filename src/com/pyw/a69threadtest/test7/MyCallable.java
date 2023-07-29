package com.pyw.a69threadtest.test7;

import com.pyw.a69threadtest.test6demo2.MyThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    ArrayList<Integer> arrayList;

    public MyCallable() {
    }

    public MyCallable(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }


    @Override
    public Integer call() throws Exception {
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
                            Thread.currentThread().getName() + "总共产生了" + boxList.size() + "个奖项。" +
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
            Thread.sleep(10);

        }
        //把集合中的最大值返回
        System.out.println(boxList);
        int max = Collections.max(boxList);
        System.out.println("max:"+max);
        System.out.println("max == 0 ? 0 : max -->"+ (max == 0 ? 0 : max));
        return max == 0 ? 0 : max;
    }
}
