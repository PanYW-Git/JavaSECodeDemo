package com.pyw.a17regex;

public class RegexDemo10 {
    public static void main(String[] args) {
        //TODO 把多个重复字符替换为一个
                /*需求:
            将字符串:我要学学编编编编程程程程程程替换为:我要学编程
        */
        String str = "我要学学编编编编程程程程程程";

        //需求:把重复的内容 替换为 单个的
        //学学                学
        //编编编编            编
        //程程程程程程        程
        //  (.)表示把重复内容的第一个字符看做一组
        //  \\1表示第一字符再次出现
        //  + 至少一次
        //  $1 表示把正则表达式中第一组的内容，再拿出来用
        String result = str.replaceAll("(.)\\1+","$1");
        System.out.println(result);
    }
}
