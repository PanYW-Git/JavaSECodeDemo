package com.pyw.a16api;

public class SystemDemo {
    public static void main(String[] args) {

        // 停止虚拟机
//        System.exit(0);
        // 打印时间毫秒为单位
        // 我国在东八区，有8小时时间差 所以我国的时间为 1970-01-01 08:00:00
        long l = System.currentTimeMillis();
        System.out.println(l);

        //拷贝数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        //参数一：数据源
        //参数二：从数据源的第几个索引开始拷贝
        //参数三：目的地（拷贝到哪个数组中？）
        //参数四：从目的地的第几个索引开始粘贴
        //参数五：拷贝数组的长度
        //注：
        // 1.两者数据类型必须一致否则会报错
        // 2.拷贝的时候需要考虑长度，超出范围会报错
        // 3.如果数据源是引用类型，那么子类可以给父类
        System.arraycopy(arr,0,arr2,0,10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //练习
        int[] arr3 = {0,0,0,1,2,3,0,0,0,0};
        int[] arr4 = new int[3];
        System.arraycopy(arr3,3,arr4,0,3);
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
