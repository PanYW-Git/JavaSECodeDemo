package com.pyw.a23sort;

public class A02_SelectionDemo {
    public static void main(String[] args) {
        //TODO 选择排序
        /*
            1，从0索引开始，跟后面的元素一一比较。
            2，小的放前面，大的放后面。
            3，第一次循环结束后，最小的数据已经确定。
            4，第二次循环从1索引开始以此类推。
        * */
        //1.定义数组
        int[] arr = {2, 4, 5, 3, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
