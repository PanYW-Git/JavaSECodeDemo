package com.pyw.a26test;

public class Test4 {
    public static void main(String[] args) {
        //TODO 爬楼梯 有时候爬上一个台阶，有时候爬两个台阶
        //如果台阶有100层小明一共又多少种爬法？
        System.out.println(getCount(20));
    }

    public static int getCount(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return getCount(n - 1) + getCount(n - 2);
    }
}
