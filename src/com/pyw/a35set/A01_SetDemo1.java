package com.pyw.a35set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_SetDemo1 {
    public static void main(String[] args) {
       /*
           利用Set系列的集合，添加字符串，并使用多种方式遍历。
            迭代器
            增强for
            Lambda表达式

        */


        //1.创建一个Set集合的对象
        Set<String> s = new HashSet<>();

        //2,添加元素
        //如果当前元素是第一次添加，那么可以添加成功，返回true
        //如果当前元素是第二次添加，那么添加失败，返回false
        s.add("张三");
        s.add("李四");
        s.add("王五");

        //3.打印集合
        //无序
        System.out.println(s);//[李四, 张三, 王五]

        System.out.println("=====迭代器=====");
        //迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }

        System.out.println("=====增强for=====");
        for (String s1 : s) {
            System.out.println(s1);
        }

        System.out.println("=====Lambda表达式=====");
        // Lambda表达式
        s.forEach(str -> System.out.println(str));

        //复杂写法
        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });

    }
}
