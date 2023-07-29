package com.pyw.a09string;

import java.util.Scanner;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        //键盘接收一个字符串，判断字符串是否对称，并在控制台打印是或不是
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        check(str);
    }

    public static boolean check(String str){
        StringBuilder sb = new StringBuilder(str);
        if(sb.reverse().toString().equals(str)){
            System.out.println("是对称的");
            return true;
        }else {
            System.out.println("不是对称的");
            return false;
        }
    }
}
