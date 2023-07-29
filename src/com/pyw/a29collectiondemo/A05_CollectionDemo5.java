package com.pyw.a29collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A05_CollectionDemo5 {
    public static void main(String[] args) {
      /*
        迭代器的细节注意点：
            1.如果没有位置，还要强行获取，报错NoSuchElementException
            2.迭代器遍历完毕，指针不会复位
            3.循环中只能用一次next方法
            4.迭代器遍历时，不能用集合的方法进行增加或者删除
                暂时当做一个结论先行记忆，在今天我们会讲解源码详细的再来分析。
                如果我实在要删除：那么可以用迭代器提供的remove方法进行删除。
                如果我要添加，暂时没有办法。
       */

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //2.获取迭代器对象
        //迭代器就好比是一个箭头，默认指向集合的0索引处
        Iterator<String> it = coll.iterator();
        //3.利用循环不断的去获取集合中的每一个元素
        while(it.hasNext()){
            //4.next方法的两件事情：获取元素,并移动指针
            String str = it.next();
            if("bbb".equals(str)){
                //coll.remove("bbb");//并发异常
                it.remove();//如果需要删除，可以用迭代器进行删除
            }
        }
        System.out.println(coll);

    }
}
