package com.pyw.a04ternaryoperator;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        //基本语法 条件表达式 ? 条件为真执行 : 条件为假执行
        //注：三元运算符必须被使用，有返回值
        int a = 30;
        int b = 20;
        System.out.println(b > a ? b : a);
    }
}
