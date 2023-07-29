package com.pyw.a09string;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //TODO StringJoiner 1.创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");

        //2，添加元素
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");

        System.out.println(sj);
    }
}
