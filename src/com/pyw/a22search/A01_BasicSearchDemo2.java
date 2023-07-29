package com.pyw.a22search;

import java.util.ArrayList;
import java.util.List;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //练习
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中元素是否重复
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 81;
        System.out.println(basicSearch(arr, number));

        //课堂练习2：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：需要考虑数组中元素有重复的可能性
        //{131, 127, 147, 81, 103, 23, 7, 79, 81}
        //我要查找81，想要返回的是所有索引 3 8
        int[] arr2 = {131, 127, 147, 81, 103, 23, 7, 81};
        int number2 = 81;
        System.out.println(basicSearch2(arr2, number2));
    }

    public static int basicSearch(int[] arr, int number){
        //利用基本查找来查找number在数组中是否存在
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> basicSearch2(int[] arr2, int number){
        List<Integer> list = new ArrayList<>();
        //利用基本查找来查找number在数组中是否存在
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] == number){
                list.add(i);
            }
        }
        return list;
    }
}
