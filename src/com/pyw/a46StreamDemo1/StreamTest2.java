package com.pyw.a46StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest2 {
    public static void main(String[] args) {
        /*
            TODO 在集合中保留年龄大于等于24岁的人，并存到map集合中
             姓名为键，年龄为值
             集合添加"zhangsan, 23","lisi, 24","wangwu, 25"

         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan, 23","lisi, 24","wangwu, 25");

        Map<String, Integer> newMap = list.stream()
                .filter(s -> Integer.valueOf(s.split(", ")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(", ")[0],
                        s -> Integer.valueOf(s.split(", ")[1])));
        System.out.println(newMap);
    }
}
