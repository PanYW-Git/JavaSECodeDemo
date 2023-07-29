package com.pyw.a16api;

import java.math.BigInteger;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        /*
            public BigInteger(int num, Random rnd) 获取随机大整数，范围:[0~ 2的num次方-11
            public BigInteger(String val) 获取指定的大整数
            public BigInteger(String val, int radix) 获取指定进制的大整数

            public static BigInteger valueOf(long val) 静态方法获取BigInteger的对象，内部有优化

            细节:
            对象一旦创建里面的数据不能发生改变。
        */

        //1.获取一个随机的大整数
//        Random r = new Random();
//        for (int i = 0; i < 100; i++) {
//            BigInteger bd1 = new BigInteger(4, r);//0 ~ 2的4次方中随机(不包含)
//            System.out.println(bd1);//[@ ~ 15]}
//        }

        //2.获取一个指定的大整数
        //字符串中必须是整数，否则会报错
        BigInteger bd22 = new BigInteger("1");
        System.out.println(bd22);

        //3.获取指定进制的大整数
        //细节:
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合。
        //比如二进制中，那么只能写0和1，写其他的就报错。
        BigInteger bd4 = new BigInteger("0101010101", 2); //二进制中的0101010101转换为10进制
        System.out.println(bd4);

        //4.静态方法获取BigInteger的对象，内部有优化
        //细节:
        //1.能表示范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了。
        //2.在内部对常用的数字: -16 ~ 16 进行了优化。
        //  提前把-16~16 先创建好BigInteger的对象，如果多次获取不会重新创建新的。
        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);
        System.out.println(bd5 == bd6);//true

        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        System.out.println(bd7 == bd8);//false

        //5.对象一旦创建内部的数据不能发生改变
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        //此时，不会修改参与计算的BigInteger对象中的借，而是产生了一个新的BigInteger对象记录
        BigInteger result = bd9.add(bd10);
        System.out.println(result);//3


        //计算
        /*
            public BigInteger add(BigInteger val) 加法
            public BigInteger subtract(BigInteger val) 减法
            public BigInteger multiply(BigInteger val) 乘法
            public BigInteger divide(BigInteger val) 除法，获取商
            public BigInteger[] divideAndRemainder(BigInteger val) 除法，获取商和余数
            public boolean equals(Object x) 比较是否相同
            public BigInteger pow(int exponent) 次幂
            public BigInteger max/min(BigInteger val) 返回较大值/较小值
            public int intValue(BigInteger val) 转为int类型整数，超出范围数据有误
        */

        //1.创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2.加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println("加:"+bd3);

        //3.除法，获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println("商:"+arr[0]);//商
        System.out.println("余:"+arr[1]);//余

        //4.比较是否相同
        boolean result1 = bd1.equals(bd2);
        System.out.println("比较是否相同:"+result1);

        //5.次幂
        BigInteger bd11 = bd1.pow(2);
        System.out.println("次幂:"+bd11);

        //6.max
        BigInteger bd12 = bd1.max(bd2);
        System.out.println("max:"+bd12);


        //7.转为int类型整数，超出范围数据有误
        /* BigInteger bd14 = BigInteger.valueOf(2147483647L);
         int i = bd14.intValue();
         System.out.println(i);
         */

        BigInteger bd13 = BigInteger.valueOf(200);
        double v = bd13.doubleValue();
        System.out.println("valueOf:"+v);//200.0
    }
}
