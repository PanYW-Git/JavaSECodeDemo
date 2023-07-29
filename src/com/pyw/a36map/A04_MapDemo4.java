package com.pyw.a36map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A04_MapDemo4 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式


        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        //键：人物的名字
        //值：名人名言
        map.put("鲁迅","这句话是我说的");
        map.put("曹操","不可能绝对不可能");
        map.put("刘备","接着奏乐接着舞");
        map.put("柯镇恶","看我眼色行事");

        //3.利用lambda表达式进行遍历
        //底层：
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值
        //再调用accept方法
        //调用的函数式接口为BiConsumer
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "：" + value);
            }
        });

        //简化写法
        map.forEach((key,value)->System.out.println(key + "：" + value));

    }
}
