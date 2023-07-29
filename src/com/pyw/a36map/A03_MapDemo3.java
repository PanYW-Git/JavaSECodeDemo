package com.pyw.a36map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //TODO Map集合的第二种遍历方式

        //三个课堂练习：
        //
        //练习一：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用增强for的形式进行遍历
        //练习二：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
        //练习三：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用lambda的形式进行遍历

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        //键：人物的外号
        //值：人物的名字
        map.put("标枪选手", "马超");
        map.put("人物挂件", "明世隐");
        map.put("御龙骑士", "尹志平");

       //3.Map集合的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1 通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //3.2 遍历entries这个集合，去得到里面的每一个键值对对象

        //增强for
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "：" + value);
        }

        //迭代器
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "：" + value);
        }

        //lambda表达式
        entries.forEach((entry) ->{
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "：" + value);
        });


    }
}