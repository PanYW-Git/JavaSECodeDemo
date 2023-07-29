package com.pyw.a20integer;

public class A01_IntegerDemo1 {
    public static void main(String[] args) {
                /*
            public Integer(int value) 根据传递的整数创建一个Integer对象
            public Integer(String s) 根据传递的字符串创建一个Integer对象
            public static Integer valueOf(int i) 根据传递的整数创建一个Integer对象
            public static Integer valueof(String s) 根据传递的字符串创建一个Integer对象
            public static Integer valueof(String s, int radix) 根据传递的字符串和进制创建一个Integer对象
        */

        //1.利用构造方法获取Integer的对象(JDK5以前的方式)
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1);
        System.out.println(i2);

        //2.利用静态方法获取Integer的对象(JDK5以前的方式)
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("0101111", 2);

        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        //3.这两种方式获取对象的区别(掌握)
        //底层原理：
        //因为在实际开发中，-128~127之间的数据，用的比较多。
        //如果每次使用都是new对象，那么太浪费内存了
        //所以，提前把这个范围之内的每一个数据都创建好对象
        //如果要用到了不会创建新的，而是返回已经创建好的对象。
        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6 == i7);//true

        Integer i61 = Integer.valueOf(-128);
        Integer i71 = Integer.valueOf(-128);
        System.out.println(i61 == i71);//true

        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8 == i9);//false

        Integer i81 = Integer.valueOf(-129);
        Integer i91 = Integer.valueOf(-129);
        System.out.println(i81 == i91);//false

        //因为看到了new关键字，在Java中，每一次new都是创建了一个新的对象
        //所以下面的两个对象都是new出来，地址值不一样。
        Integer i10 = new Integer(127);
        Integer i11 = new Integer(127);
        System.out.println(i10 == i11);

        Integer i12 = new Integer(128);
        Integer i13 = new Integer(128);
        System.out.println(i12 == i13);
    }
}
