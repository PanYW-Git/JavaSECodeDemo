package com.pyw.a71mythreadpool2;

public class MyThreadPoolDemo2 {
    public static void main(String[] args) {
        //向java虚拟机返回可用处理器的数目
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println("java虚拟机可用处理器的数目:"+count);
    }
}
