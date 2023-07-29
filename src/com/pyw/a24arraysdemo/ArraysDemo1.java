package com.pyw.a24arraysdemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //tostring: 将数组变成字符串
        System.out.println("-----------------toString--------------------------");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));

        //binarySearch:二分查找发查找元素
        //细节1：二分查找的前提：数组中的元素必须是有序，且数组元素必须时升序
        //细节2：如果查找的元素时存在的，返回的是真实的索引，如果查找的元素不存在，返回的是 - 插入点 - 1
        //也就是- 10(插入点) -1
        //为什么要-1？如果我现在要查找数字0，那么如果返回的值是- 插入点，就会出现问题
        //如果要查找数字0，此时0是不存在的，但是按照上面的规则-插入点应该就是-0，-0也是0，避免这样的情况在这个基础上又-1了
        System.out.println("-----------------binarySearch--------------------------");
        System.out.println(Arrays.binarySearch(arr, 10));//9
        System.out.println(Arrays.binarySearch(arr, 2));//1
        System.out.println(Arrays.binarySearch(arr, 20));//-11

        //copyOf:拷贝数组
        //参数一：老数组
        //参数二：新数组的长度
        //返回值：新数组
        //如果新数组小于老数组的长度，会部分拷贝
        //如果新数组等于老数组的长度，会完全拷贝
        //如果新数组大于老数组的长度，会补上默认初始值
        System.out.println("-----------------copyOf--------------------------");
//        System.out.println(arr.length);
        int[] newArr1 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(newArr1));

        //copyOfRange：拷贝数组(指定范围)
        //细节：包头不包尾，包左不包右
        System.out.println("-----------------copyOfRange--------------------------");
        int[] newArr2 = Arrays.copyOfRange(arr, 0, 9);//拷贝了索引为0~8的数据
        System.out.println(Arrays.toString(newArr2));

        //fill：填充数组，把每一个元素都变成填充的哪个元素
        System.out.println("-----------------fill--------------------------");
        Arrays.fill(arr, 20);
        System.out.println(Arrays.toString(arr));

        //sort：排序，默认情况下，给基本数据类型进行升序排列
        System.out.println("-----------------sort--------------------------");
        int[] arr2 = {10, 2, 5, 1, 4, 3, 6, 7, 8, 9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //更改排序规则
        /*
            public static void sort(数组，排序规则) 按照指定的规则排序

            参数一：要排序的数组
            参数二：排序的规则
            细节：
                只能给引用数据类型的数组进行排序
                如果数组是基本数据类型，需要变成对应的包装类
         */

        //底层原理:
        //利用插入排序 + 二分查找的方式进行排序的。
        //默认把0索引的数据当做是有序的序列，1索引到最后认为是无序的序列。
        //遍历无序的序列得到里面的每一个元素，假设当前遍历得到的元素是A元素
        //把A往有序序列中进行插入，在插入的时候，是利用二分查找确定A元素的插入点。
        //拿着A元素，跟插入点的元素进行比较，比较的规则就是compare方法的方法体
        //如果方法的返回值是负数，拿着A继续跟前面的数据进行比较
        //如果方法的返回值是正数，拿着A继续跟后面的数据进行比较
        //如果方法的返回值是0，也拿着A跟后面的数据进行比较
        //直到能确定A的最终位置为止。

        //compare方法的形式参数:
        //参数一 o1: 表示在无序序列中，遍历得到的每一个元素
        //参数二 o2: 有序序列中的元素

        //返回值:
        //负数:表示当前要插入的元素是小的，放在前面
        //正数:表示当前要插入的元素是大的，放在后面
        //0: 表示当前要插入的元素跟现在的元素比是一样的们也会放在后面

        //简单理解
//        return o1 - o2;//升序排序
//        return o2 - o1;//降序排序
        Integer[] arr3 = {10, 2, 5, 1, 4, 3, 6, 7, 8, 9};
        Arrays.sort(arr3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("=============");
                System.out.println("o1:" + o1);
                System.out.println("o2:" + o2);
                System.out.println(o1 - o2);
//                return o1 - o2;//升序排序
                return o2 - o1;//降序排序
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
