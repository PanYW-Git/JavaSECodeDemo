package com.pyw.a16api;

import java.io.IOException;

public class RunTimeDemo1 {
    public static void main(String[] args) {
        //todo RunTime
        //获取当前虚拟机运行环境类

        //单例设计，只可以获取Runtime对象，不管获取多少次都是使用的同一对象
        Runtime r1 = Runtime.getRuntime();
        //也可以这样使用
//        Runtime.getRuntime().exit(0);

        //停止虚拟机
//        r1.exit(0);

        //获取CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //虚拟机总内存大小，默认单位是byte字节
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //虚拟机已经从操作系统中获取到的内存大小，默认单位是byte字节
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //运行cmd命令
        try {
            Runtime.getRuntime().exec("notepad");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
