package com.pyw.a09string;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //链式编程
        //当在调用一个方式，不需要变量接收结果，可以继续调用其他方法
        String str = "abc";
        str.replace("abc","**").length();
    }
}
