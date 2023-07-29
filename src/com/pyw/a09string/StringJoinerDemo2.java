package com.pyw.a09string;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        // 1.创建对象
        StringJoiner sj = new StringJoiner(", ","[","]");

        // 2.添加元素
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");

        // len
        int len = sj.length();
        System.out.println(len);//15 打印的是字符的个数，是最终效果的长度[aaa, bbb, ccc]

        // toString
        String s = sj.toString();
        System.out.println(s);

        // 3.打印
        System.out.println(sj);
    }
}
