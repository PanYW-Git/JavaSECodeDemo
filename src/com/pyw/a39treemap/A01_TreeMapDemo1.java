package com.pyw.a39treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class A01_TreeMapDemo1 {
    public static void main(String[] args) {
        //TODO TreeMap
        /*
           TreeMap集合：基本应用
           基于红黑树，增删改查性能较好
            需求1：
                键：整数表示id
	            值：字符串表示商品名称
	            要求1：按照id的升序排列

	            要求2：按照id的降序排列
         */

        //1.创建集合对象
        //按照键排序，重写compare方法
        //Integer Double 默认情况下都是按照升序排列的
        //String 按照字母再ASCII码表中对应的数字升序进行排列 abcdefg ...
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1 添加的元素
                //o2 红黑树中的元素
                return o2 - o1;
            }
        });


        //2.添加元素
        tm.put(1,"iphone");
        tm.put(2,"huawei");
        tm.put(3,"xiaomi");
        tm.put(4,"meizu");
        tm.put(5,"redmi");

        //3.打印集合
        System.out.println(tm);








    }
}
