package com.pyw.a06array;

import java.util.Random;

public class ArrayTest7 {
    public static void main(String[] args) {
        // 定义一个数组，存入1~5，要求打乱数组中的顺序
        int[] arr = {1,2,3,4,5};
        int temp = 0;
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            // ps :这里因为是交换的，所以生成的随机数就算重复也不会改变数组中的值，只会改变顺序
            int randomIndex = r.nextInt(arr.length);
            temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
