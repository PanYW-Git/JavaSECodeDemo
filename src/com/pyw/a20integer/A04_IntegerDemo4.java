package com.pyw.a20integer;

public class A04_IntegerDemo4 {
    public static void main(String[] args) {
        /*
            public static string tobinarystring(int i) 得到二进制
            public static string tooctalstring(int i) 得到八进制
            public static string toHexstring(int i) 得到十六进制
            public static int parseInt(string s) 将字符串类型的整数转成int类型的整数
        */

        //1.把整数转成二进制，十六进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);//1100100

        //2.把整数转成八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);//144

        //3.把整数转成十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);//64

        //4.将字符串类型的整数转成int类型的整数
        //强类型语言:每种数据在java中都有各自的数据类型
        //在计算的时候，如果不是同一种数据类型，是无法直接计算的。
        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i + 1);//124
        //细节1:
        //在类型转换的时候，括号中的参数只能是数字不能是其他，否则代码会报错
        //细节2:
        //8种包装类当中，除了Character都有对应的parseXxx的方法，进行类型转换
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);


    }
}
