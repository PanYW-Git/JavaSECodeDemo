package com.pyw.a36map;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        //TODO Map集合
        /*
            V put(K key,V value)                    添加元素
            V remove(Object key)                    根据键删除键值对元素
            void clear()                            移除所有的键值对元素
            boolean containsKey(Object key)         判断集合是否包含指定的键
            boolean containsValue(Object value)     判断集合是否包含指定的值
            boolean isEmpty()                       判断集合是否为空
            int size()                              集合的长度，也就是集合中键值对的个数
        */


        //1.创建Map集合的对象
        Map<String, String> m = new HashMap<>();

        //2.添加元素
        //put方法的细节：
        //添加/覆盖
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中,方法返回null
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        m.put("zhangsan", "张三");
        m.put("lisi", "李四");
        String put = m.put("wangwu", "王五");
        System.out.println("为覆盖值的返回值：" + put);

        //返回值:被覆盖的值
        String s = m.put("zhangsan", "老张三");
        System.out.println("覆盖值的返回值：" + s);

        //删除
        m.remove("zhangsan");


        //清空
//        m.clear();

        //判断是否包含
        boolean key = m.containsKey("lisi");
        //判断键
        System.out.println("判断键是否存在" + key);

        //判断值
        boolean value = m.containsValue("王五");
        System.out.println("判断值是否存在" + value);

        //判断集合是否为空
        boolean empty = m.isEmpty();
        System.out.println(empty);

        //集合的长度
        int size = m.size();
        System.out.println("集合的长度:"+size);

        //3.打印集合
        System.out.println(m);

    }
}