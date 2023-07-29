package com.pyw.a26test;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        //TODO 不死神兔 有一对兔子，从出生后第三个月起每月都生一对兔子
        //小兔子长到第三个月后每个月又生一个兔子，假如兔子不死，请问第十二个月的兔子数量为多少？
        /*
            1月：1
            2月：1
            3月：2
            4月：3
            5月：5
            6月：8
            7月：13
         */
        //求解1：
        //创建一个长度为1的数组,手动赋值
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        //用循环解决
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));

        //求解2：
        //递归的方式完成
        //1.出口
        //2.规律
        System.out.println(getSum(13));
    }

    public static int getSum(int month){
        if(month == 1|| month ==2){
            return 1;
        }else {
            return getSum(month - 2) + getSum(month - 1);
        }
    }
}
