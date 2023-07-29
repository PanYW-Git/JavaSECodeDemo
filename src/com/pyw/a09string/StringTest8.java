package com.pyw.a09string;

import java.util.Scanner;

public class StringTest8 {
    public static void main(String[] args) {
        //TODO 转换罗马数字
        /*
         * 长度小于等于9
         * 只能是数字
         * 将内容变成罗马数字
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        while (true){

            //长度小于等于9
            if(str.length() > 9){
                System.out.println("输入的长度必须小于等于9,请重新输入");
                str = sc.next();
                continue;
            }

            //只能是数字
            for (int i = 0; i < str.length(); i++) {
                char strChar = str.charAt(i);
                if(strChar < 48 || strChar > 48 +10){
                    System.out.println("输入的字符中有不为数字的,请重新输入");
                    str = sc.next();
                    continue;
                }
            }

            //输入正确跳出循环
            break;

        }

        System.out.println(numToRome(str));

    }

    //转换为罗马数字
    public static String numToRome(String str){

        StringBuilder sb = new StringBuilder("");
        String[] romeNum = {"〇","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        for (int i = 0; i < str.length(); i++) {
            char tempStrChar = str.charAt(i);
            sb.append(romeNum[tempStrChar-48]);
        }
        String result = sb.toString();
        return result;
    }
}
