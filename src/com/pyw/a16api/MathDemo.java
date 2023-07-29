package com.pyw.a16api;

public class MathDemo {
    public static void main(String[] args) {
        //TODO Math
        //绝对值
        System.out.println(Math.abs(-80));

        //向上取整
        System.out.println(Math.ceil(12.54));

        //向下取整
        System.out.println(Math.floor(13.54));

        //获取两个整数的较大值
        System.out.println(Math.max(20, 30));

        //获取两个整数的较小值
        System.out.println(Math.min(20, 30));

        //获取a的b次方
        //细节，如果第二个参数0~1之间的小数，就是开方
        //一般传输大于1的正整数
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(4, 0.5));
        //2的－2次方，表示1/4 也就是2的2次方分之一，0.25
        System.out.println(Math.pow(2, -2));

        //开平方根
        System.out.println(Math.sqrt(4));
        //开立方根
        System.out.println(Math.cbrt(8));


        //随机数0~0.99之间的随机数包含0不包含1，不常用
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }


    }
}
