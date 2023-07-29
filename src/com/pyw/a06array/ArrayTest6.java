package com.pyw.a06array;

public class ArrayTest6 {
    public static void main(String[] args) {
        //TODO 定义一个数组，123456,交换首尾对应的元素
        //交换前 12345 交换后 54321
        int[] arr = {1,2,3,4,5};
        int temp = 0;

        //方法1 自写
//        for (int i = 0; i < arr.length / 2; i++) {
//            temp = arr[arr.length -i - 1];
//            arr[arr.length - i - 1] = arr[i];
//            arr[i] = temp;
//        }

        //方法2 来自教程
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
