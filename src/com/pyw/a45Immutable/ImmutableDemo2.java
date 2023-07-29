package com.pyw.a45Immutable;

import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        /*
            创建不可变的Set集合
            "张三","李四","王五","赵六"

            细节：
                当我们要获取一个不可变的Set集合时，里面的参数要保证唯一性
         */

        Set<String> set = Set.of("张三","李四","王五","赵六");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("===========");

        set.forEach((str)->{
            System.out.println(str);
        });
    }
}
