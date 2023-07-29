package com.pyw.a05for_while_dowhile;

public class whileForTest6 {
    public static void main(String[] args) {
        //需求 提供两个整数，被除数和除数（整数不超过int范围） 将两数相除，不使用乘法除法，得到商和余数
        // 被除数 / 除数 = 商....余数

        int a = 10; //被除数
        int b = 3; //除数
        int temp = a;
        int c = 0; //商
        int d = 0; //余数
        while(a>=b){
            a = a-b;
            c++;
            System.out.println(c);
        }
        System.out.println(temp+"/"+b+"="+c+"余"+a);
    }

}
