package com.pyw.a07method;

public class MethodDemo2 {
    public static void main(String[] args) {
        int sum1 = sumMonth(10,50,30);
        int sum2 = sumMonth(20,40,20);
        System.out.println(sum1+sum2);
    }

    public static int sumMonth(int a , int b , int c){
        return a+b+c;
    }
}
