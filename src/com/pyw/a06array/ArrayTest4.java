package com.pyw.a06array;

public class ArrayTest4 {
    public static void main(String[] args) {
        //TDO 数组求最值

        //最大值
        int[] arr = {33,5,22,44,66,55};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

        //最小值
        int[] arr2 = {33,5,22,44,66,55};
        int min = arr2[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr2[i] < min){
                min = arr2[i];
            }
        }
        System.out.println(min);
    }
}
