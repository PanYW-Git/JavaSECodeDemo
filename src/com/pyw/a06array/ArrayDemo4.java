package com.pyw.a06array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //TODO 数组动态初始化 int[] arr = new int[3]
        //建立一个数组，存储学生50个姓名
        String[] arr = new String[50];
        //添加学生信息
        arr[0] = "张三";
        arr[1] = "李四";
        //获取
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //数组默认初始化值的规律
        //整数类型，默认初始化0
        //小数类型，默认初始化0.0
        //字符类型，默认初始化值'/u0000' 空格
        //布尔类型，默认初始化值 false
        //引用数据类型，默认初始化值 null
        int[] arr2 = new int[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("整数："+arr2[i]);
        }
    }
}
