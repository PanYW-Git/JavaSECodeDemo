package com.pyw.a26test;

public class Test22 {
    public static void main(String[] args) {
        //TODO 不死神兔 有一对兔子，从出生后第三个月起每月都生一对兔子
        //小兔子长到第三个月后每个月又生一个兔子，假如兔子不死，请问第十二个月的兔子数量为多少？
        /*
            1月：1
            2月：1
            3月：2
            4月：3
            5月：5
            6月：8
            7月：13
         */
        //求解1：
        //创建一个长度为1的数组,手动赋值
        System.out.println(getSum(12));
    }

    public static int getSum(int day){
        if(day==1||day==2){
            return 1;
        }

        return getSum(day-1)+getSum(day-2);
    }

}
