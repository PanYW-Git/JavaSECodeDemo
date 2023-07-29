package com.pyw.a43test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        //TODO 随机点名器
        //添加学生
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            arr.add(i+1);
        }
        Random r = new Random();
        int index = r.nextInt(80);
        System.out.println(arr.get(index));

        Collections.shuffle(arr);
        System.out.println(arr.get(0));
    }
}
