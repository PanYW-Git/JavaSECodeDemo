package com.pyw.a29collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        /*
            Collection系列集合三种通用的遍历方式：
                1.迭代器遍历
                2.增强for遍历
                3.lambda表达式遍历


             迭代器遍历相关的三个方法：
                    Iterator<E> iterator()  ：获取一个迭代器对象
                    boolean hasNext()       ：判断当前指向的位置是否有元素
                    E next()                ：获取当前指向的元素并移动指针
        */

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器对象
        //迭代器就好比是一个箭头，默认指向集合的0索引处
        Iterator<String> it = coll.iterator();
        //3.利用循环不断的去获取集合中的每一个元素
        while(it.hasNext()){
            //4.next方法的两件事情：获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }

    }
}
