package com.pyw.a09string;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.架设录入一个abc
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String str1 = scanner.next();
        //2.代码中再顶一个一个abc

        String str2 = "abc";
        //3.用==比较，是一样吗？
        System.out.println(str1 == str2);

    }
}
