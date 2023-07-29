package com.pyw.a09string;

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        //TODO 键盘录入一个字符串，统计该字符串中的大写字母，小写字母，数字出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入任意字符");
        String str = sc.next();
        int countBigNum = 0;
        int countSmlNum = 0;
        int countNum = 0;
        for (int i = 0; i < str.length(); i++) {
            //获取当前字符
            int charAt = str.charAt(i);

//            //大写字母出现
//            if(charAt >=65 && charAt <= 90){
//                countBigNum++;
//            }
//
//            //小写字母出现
//            if(charAt >=97 && charAt <= 122){
//                countSmlNum++;
//            }
//
//            //数字出现
//            if(charAt >= 48 && charAt <= 57){
//                countNum++;
//            }
            //大写字母出现
            if(charAt >='A' && charAt <= 'Z'){
                countBigNum++;
            }

            //小写字母出现
            if(charAt >='a' && charAt <= 'z'){
                countSmlNum++;
            }

            //数字出现 注意这个地方需要加引号
            if(charAt >= '0' && charAt <= '9'){
                countNum++;
            }

        }
        System.out.println("大写字母："+countBigNum);
        System.out.println("小写字母："+countSmlNum);
        System.out.println("数字："+countNum);
    }
}
