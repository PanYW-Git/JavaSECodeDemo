package com.pyw.a06array;

public class ArrayTest1 {
    public static void main(String[] args) {
        //TODO 定义一个数组，存储12345 求这个数组里面的和
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
