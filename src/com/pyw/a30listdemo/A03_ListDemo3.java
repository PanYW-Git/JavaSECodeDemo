package com.pyw.a30listdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        /*
            List系列集合的五种遍历方式：
                1.迭代器 遍历过程中需要删除元素，用迭代器
                2.列表迭代器 在遍历过程中需要添加元素，用列表迭代器
                3.增强for 仅想遍历，使用增强for或Lambda
                4.Lambda表达式 仅想遍历，使用增强for或Lambda
                5.普通for循环 遍历的时候需要操作索引，使用普通for
         */


        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/


        //2.增强for
        //下面的变量s，其实就是一个第三方的变量而已。
        //在循环的过程中，依次表示集合中的每一个元素
       /* for (String s : list) {
            System.out.println(s);
        }*/

        //3.Lambda表达式
        //forEach方法的底层其实就是一个循环遍历，依次得到集合中的每一个元素
        //并把每一个元素传递给下面的accept方法
        //accept方法的形参s，依次表示集合中的每一个元素
        //list.forEach(s->System.out.println(s) );


        //4.普通for循环
        //size方法跟get方法还有循环结合的方式，利用索引获取到集合中的每一个元素
        /*for (int i = 0; i < list.size(); i++) {
            //i:依次表示集合中的每一个索引
            String s = list.get(i);
            System.out.println(s);
        }*/

        // 5.列表迭代器
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
        ListIterator<String> it = list.listIterator();
        //额外添加了一个方法：在遍历的过程中，可以添加元素
        while(it.hasNext()){
            String s = it.next();
            if("bbb".equals(s)){
                //不能使用集合添加，已经被占用了，会报出并发修改异常
                //这个时候应该用列表迭代器添加（额外新增的方法）
                it.add("qqq");
            }
            System.out.println(s);
        }
        System.out.println(list);



    }
}
