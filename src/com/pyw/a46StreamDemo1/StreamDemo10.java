package com.pyw.a46StreamDemo1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        /*
            TODO collect(Collector collector)            收集流中的数据，放到集合中 (List Set Map)

            注意点：
                如果我们要收集到Map集合当中，键不能重复，否则会报错
       */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        //收集List集合当中
        //需求：把所有的男性收集起来
        //List集合不去重
        List<String> newList1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newList1);

        //收集到Set集合当中
        //需求：把所有的男性收集起来
        //HashSet集合去重
        Set<String> newList2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newList2);

        //收集到Map集合当中
        //需求：把所有的男性收集起来
        //键：姓名，值年龄
        //HashSet集合去重
        Map<String, Integer> newMap = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                /*
                * toMap:参数一表示键的生成规则
                *       参数二表示值的生成规则
                *
                * 参数一：
                *       funcation泛型一：表示流中的每一个数据的类型
                *                泛型二：表示Map集合中键的数据类型
                *       方法apply形参：一次表示流里面的每一个数据
                *               方法体：生成键的代码
                *               返回值：map集合键的类型
                * 参数二：
                *       funcation泛型一：表示流中的每一个数据的类型
                *                泛型二：表示Map集合中值的数据类型
                *       方法apply形参：一次表示流里面的每一个数据
                *               方法体：生成值的代码
                *               返回值：map集合值的类型
                *
                 */
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        System.out.println(s.split("-")[0]);
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.valueOf(s.split("-")[2]);
                    }
                }));

        //Lambda简写
        Map<String, Integer> newMap2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.valueOf(s.split("-")[2])));
        System.out.println(newMap);

        System.out.println(newMap2);

    }
}
