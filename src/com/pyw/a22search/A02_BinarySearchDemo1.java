package com.pyw.a22search;

import java.time.LocalDateTime;

public class A02_BinarySearchDemo1 {

    private static int count = 0;
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}

        //对比基本查找的优势
        //提高查找效率
        //前提条件
        //数据必须有顺序的时候才能使用

        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 80));

        /*
        * 在介绍插值查找之前，先考虑一个问题：

          为什么二分查找算法一定要是折半，而不是折四分之一或者折更多呢？

          其实就是因为方便，简单，但是如果我能在二分查找的基础上，让中间的mid点，尽可能靠近想要查找的元素，那不就能提高查找的效率了吗？

          二分查找中查找点计算如下：

　　       mid=(low+high)/2, 即mid=low+1/2*(high-low);

          我们可以将查找的点改进为如下：

　　      mid=low+(key-a[low])/(a[high]-a[low])*(high-low)，

          这样，让mid值的变化更靠近关键字key，这样也就间接地减少了比较次数。

　　      基本思想：基于二分查找算法，将查找点的选择改进为自适应选择，可以提高查找效率。当然，差值查找也属于有序查找。

          细节：对于表长较大，而关键字分布又比较均匀的查找表来说，插值查找算法的平均性能比折半查找要好的多。反之，数组中如果分布非常不均匀，那么插值查找未必是很合适的选择。

          代码跟二分查找类似，只要修改一下mid的计算方式即可。
        * */

        int[] arr2 = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr2[i] = i+1;
        }

        LocalDateTime date = LocalDateTime.now();
        long start = date.getNano()/1000/1000;
        for (int i = 0; i < 100000; i++) {
            binarySearch2(arr2, 7);
        }
        LocalDateTime date2 = LocalDateTime.now();
        long end = date2.getNano() / 1000/1000;
        System.out.println("有序的情况下插值查找执行1万次执行时间：" + (end - start)+"毫秒  找到的次数为："+count);


        LocalDateTime date3 = LocalDateTime.now();
        long start2 = date3.getNano()/1000/1000;
        for (int i = 0; i < 100000; i++) {
            binarySearch(arr2, 7);
        }
        LocalDateTime date4 = LocalDateTime.now();
        long end2 = date4.getNano() / 1000/1000;
        System.out.println("有序的情况下二分查找执行1万次执行时间：" + (end2 - start2)+"毫秒  找到的次数为："+count);

    }

    public static int binarySearch(int[] arr, int num) {
        //1.定义两个变量记录要查找的范围
        int min = 0;
        int max = arr.length -1;
        count = 0;
        //2.利用循环不断的去找要查找的数据
        while (true) {
            count++;
            //min比max大的时候说明数据已经找完了返回没有数据
            if (min > max) {
                return -1;
            }
            //3.找到min和max的中间位置
            int mid = (min + max) / 2;
            //4.拿着mid指向的元素跟要查找的元素进行比较
            if (num > arr[mid]) {
                //4.2 number在mid的右边
                //max不变，min = mid + 1;
                min = mid + 1;
            } else if (num < arr[mid]) {
                //4.2 number在mid的左边
                //min不变，max = mid - 1；
                max = mid - 1;
            } else {
                //4.3 number跟mid指向的元素一样
                //找到了
                return mid;
            }
        }

    }

    public static int binarySearch2 ( int[] arr, int num){
        //1.定义两个变量记录要查找的范围
        int min = 0;
        int max = arr.length -1 ;
        count = 0;
        //2.利用循环不断的去找要查找的数据
        while (true) {
            count++;
            //min比max大的时候说明数据已经找完了返回没有数据
            if (min > max) {
                return -1;
            }
            //3.插值查找找到数据的大概位置
            int mid = min + ((num - arr[min]) / (arr[max] - arr[min])) * (max - min);
            //4.拿着mid指向的元素跟要查找的元素进行比较
            if (num > arr[mid]) {
                //4.2 number在mid的右边
                //max不变，min = mid + 1;
                min = mid + 1;
            } else if (num < arr[mid]) {
                //4.2 number在mid的左边
                //min不变，max = mid - 1；
                max = mid - 1;
            } else {
                //4.3 number跟mid指向的元素一样
                //找到了
                return mid;
            }
        }

    }
}