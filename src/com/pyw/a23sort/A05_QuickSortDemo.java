package com.pyw.a23sort;

import java.util.Arrays;
import java.util.Random;

public class A05_QuickSortDemo {
    public static int count = 0;
    public static void main(String[] args) {
        //TODO 快速排序
        /*
        快速排序：
           第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
           比基准数小的全部在左边，比基准数大的全部在右边。
           后面以此类推。
           结果：
         */

        int[] arr = {6, 2, 7, 9, 3, 4, 5, 1, 10, 8,11};
        //测试效率可打开这一段
//        int[] arr = new int[100000];

//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt();
//            System.out.println(arr[i]);
//        }


        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("count:"+count);

        System.out.println("用时："+(end - start)+"毫秒");//149

//        System.out.println(Arrays.toString(arr));
        //课堂练习：
        //我们可以利用相同的办法去测试一下，选择排序，冒泡排序以及插入排序运行的效率
        //得到一个结论：快速排序真的非常快。
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /*
     *   参数一：我们要排序的数组
     *   参数二：要排序数组的起始索引
     *   参数三：要排序数组的结束索引
     * */
    public static void quickSort(int[] arr, int i, int j) {
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;
        if (start > end) {
            return;
        }
        //记录基准数
        int baseNumber = arr[i];
        //利用循环找到要交换的数字
        while (start != end) {
            //利用end，从后往前开始找，找比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //利用start，从前往后开始找，找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
//            System.out.println("交换的start：" + start + "  交换的end：" + end);
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //如果start等于end，那么就找到了基准数的位置
//        System.out.println("找到了基准数的位置：基准数arr[i]：" + arr[i] + "  交换的数据arr[start]：" + arr[start]);
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
        System.out.println("当前基准数为："+baseNumber+"当前轮次的数据为：");
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1]+" ");
        }
        System.out.println();
        count++;
        //确定6左边的范围，重复刚刚所做的事情
        quickSort(arr, i, start - 1);
//        System.out.println("6的左边排序结束了");
        //确定6右边的范围，重复刚刚所做的事情
        quickSort(arr, start + 1, j);
    }

}
