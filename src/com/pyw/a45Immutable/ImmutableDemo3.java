package com.pyw.a45Immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    /*
        创建Map的不可变集合
        只能传20个参数 也就是10个键值对

        如果要传超过10个的键值对可以写entry对象
     */
    public static void main(String[] args) {
        Map<String, String> map = Map.of("张三", "北京", "李四", "王五", "赵六", "广州",
                "孙七", "杭州");

        map.forEach((key,value) ->{
            System.out.println(key+":"+value);
        });

        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key+":"+value);
        }

        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
