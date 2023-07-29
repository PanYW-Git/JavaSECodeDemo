package com.pyw.a36map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //TODO Map集合的第一种遍历方式

        //三个课堂练习：
        //
        //练习一：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        //练习二：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        //练习三：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历


        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();
        //2.添加元素
        map.put("zhangsan", "张三");
        map.put("lisi", "李四");
        map.put("wangwu", "王五");

        //3.通过键找值
        String zhangsan = map.get("zhangsan");
        System.out.println(zhangsan);

        //3.1获取所有的键，把这些键放到一个单列集合当中
        Set<String> keys = map.keySet();
        //3.2遍历单列集合，得到每一个键
        //迭代器
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + "：" + value);
        }

        //增强for
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "：" + value);
        }

        //lambda
        keys.forEach((key) -> {
            String value = map.get(key);
            System.out.println(key + "：" + value);
        });


    }
}
