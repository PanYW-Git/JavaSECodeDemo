package com.pyw.a06array;

public class ArrayTest2 {
    public static void main(String[] args) {
        //定义一个数组存储12345678910 统计数组里面有几个能被3整除
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
