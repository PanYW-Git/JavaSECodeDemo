package com.pyw.a07method;

public class MethodTest1 {
    public static void main(String[] args) {
        //TODO 定义一个方法，求长方形的周长
        getlength(2.2,3.3);

    }
    //
    public static void getlength(double len,double wid){
        double lenth = (len + wid) * 2;
        System.out.println(lenth);
    }
}
