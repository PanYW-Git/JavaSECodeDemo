package com.pyw.project.stutest;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        /*
        * 需求 定义方法实现随机产生一个五位的验证码
        * 验证码格式：
        * 长度为5
        * 前四位时大写或者小写的字母，后一位是数字
        * */
        String code = checkCode();
        System.out.println("生成的验证码为：" + code);
    }

    public static String checkCode(){
        //定义一个数组用于装载大写字母和小写字母一共52个
        char[] chars = new char[52];
        Random r = new Random();
        //使用ASCII码表进行赋值 a 的值为97
        for (int i = 0; i < chars.length; i++) {
            if(i<26){
                chars[i] = (char) (65+i);
            }else {
                chars[i] = (char) (65+i+6);
            }
            System.out.println(chars[i]+"");
        }

        //定义一个字符串用于返回验证码
        String code = "";
        //随机索引生成数据
        for (int i = 0; i < 5; i++) {
            code = code + chars[r.nextInt(chars.length)];
        }
        //最后一位使用数字生成随机数

        code = code + r.nextInt(10);
        return code;
    }
}
