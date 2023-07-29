package com.pyw.a09string;

public class StringDemo2 {
    public static void main(String[] args) {
        // 1.创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "Abc";

        //2. ==号比较
        //基本数据类型：比的是数据值
        //引用数据类型：比的是地址值
        System.out.println(s1 == s2);//false

        //3.比较字符串中的内容是否相等
        System.out.println(s1.equals(s2));

        //4.比较字符串中的内容是否相等，忽略大小写 用于验证码
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
