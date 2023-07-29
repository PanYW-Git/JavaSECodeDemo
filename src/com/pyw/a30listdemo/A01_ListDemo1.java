package com.pyw.a30listdemo;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
       /*

        List系列集合独有的方法：
            void add(int index,E element)       在此集合中的指定位置插入指定的元素
            E remove(int index)                 删除指定索引处的元素，返回被删除的元素
            E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
            E get(int index)                    返回指定索引处的元素
        */

        //1.创建一个集合
        List<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");//1
        list.add("ccc");

        //void add(int index,E element)       在此集合中的指定位置插入指定的元素
        //细节：原来索引上的元素会依次往后移
        list.add(1,"QQQ");

        //E remove(int index)                 删除指定索引处的元素，返回被删除的元素
        String remove = list.remove(1);
        System.out.println(remove);//aaa

        //E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        String result = list.set(0, "QQQ");
        System.out.println(result);

        // E get(int index)                    返回指定索引处的元素
        String s = list.get(0);
        System.out.println(s);

        //3.打印集合
        System.out.println(list);
    }
}
