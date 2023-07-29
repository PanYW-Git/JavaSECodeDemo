package com.pyw.a09string;

import java.util.Random;

public class StringTest11 {

    public static void main(String[] args) {
        //TODO 生成验证码
        //内容 可以是小写、大写字母，并且可以是数字
        //长度为5
        //内容中四位是字母，一位是数字，数字只有1位，可以出现在任意的位置
        Random r = new Random();
        //生成数字索引
        int rNum = r.nextInt(5);
        char[] chars = new char[5];
        //随机生成
        for (int i = 0; i < chars.length; i++) {
            if(i == rNum){
                chars[i] = (char) (r.nextInt(9) + 48);
            }else {
                int rLetter = r.nextInt(52) + 1;
                if(rLetter < 26){
                    chars[i] = (char) (rLetter + 65);
                }else {
                    chars[i] = (char) (rLetter - 26 + 97);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        System.out.println(sb);
    }
}
