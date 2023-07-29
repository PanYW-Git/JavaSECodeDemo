package com.pyw.a07method;

public class MethodDemo {
    public static void main(String[] args) {
        //在方法里面定义两个变量并求和打印
        MethodDemo methodDemo = new MethodDemo();
        //实参
        methodDemo.sum(10,20);
    }

    // 形参
    public void sum(int a, int b){

        System.out.println(a + b);
    }
}
