package com.pyw.a26test;

public class Test5 {
    public static void main(String[] args) {
        //TODO 规则如下 现在有20个楼梯，有三种情况，一次上一个，一次上两个，一次上三个，一共有多少种上法呢？
        System.out.println(getCount(20));
    }

    public static int getCount(int num) {
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 2;
        }
        if (num == 3) {
            return 4;
        }

        return getCount(num - 1) + getCount(num - 2) + getCount(num - 3);
    }
}
