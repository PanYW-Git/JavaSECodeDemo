package com.pyw.a43test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        //TODO 自动点名 如果学生被点到了就不会再被点了，如果所有学生都点完了会开启第二轮
        //添加学生
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i + 1);
        }
        arr2.addAll(arr);

        int count = 0;
        while (count <=2) {
            Collections.shuffle(arr2);
            if (arr2.size() > 0) {
                Integer stuShow = arr2.remove(0);
                System.out.println(stuShow);
            } else {
                System.out.println("=========");
                arr2.addAll(arr);
                count++;
            }
        }

    }
}
