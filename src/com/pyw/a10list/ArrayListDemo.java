package com.pyw.a10list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建一个集合
        // 与数组的区别
        // 1.自动增长长度
        // 2.不可以存储基本数据类型，如果需要存储基本数据类型需要用他们的封装类
        ArrayList<String> list = new ArrayList<>();

        // 2.添加元素
        boolean result = list.add("abc");
        list.add("defg");
        list.add("hijk");
        list.add("lmn");


        // 3.删除元素
        list.remove("abc");

        // 元素不存在删除失败
        boolean removeFlag = list.remove("aaa");

        // 通过索引删除 返回被删除的元素
        String str = list.remove(0);

        System.out.println(str);

        System.out.println(removeFlag);

        // 4.修改元素 被修改的元素给返回
        String setResult = list.set(1, "ddd");

        System.out.println(setResult);

        // 5.查询
        String getResult = list.get(0);

        System.out.println(getResult);

        System.out.println(list);

        // 遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
