package com.pyw.a06array;

public class ArrayTest3 {
    public static void main(String[] args) {
        //定义一个数组 12345678910 如果是奇数扩大数字两倍，如果是偶数把数字变为2/1
        //定义数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //使用循环遍历数组
        for (int i = 0; i < arr.length; i++) {
            //判断数字是否为偶数
            if(arr[i] % 2 == 0){
                //基数/2
                arr[i] /= 2;
//                System.out.println(arr[i]);
                //跳出本次循环
                continue;
            }
            //偶数*2
            arr[i] *= 2;
//            System.out.println(arr[i]);
        }

        //一个循环只做一件事儿，不然思路混淆
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
