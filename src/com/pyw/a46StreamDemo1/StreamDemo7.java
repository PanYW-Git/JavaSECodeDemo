package com.pyw.a46StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        /*
            distinct            元素去重，依赖(hashCode和equals方法)
            concat              合并a和b两个流为一个流

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌","张无忌","张无忌", "张强","张无忌", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");


        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "周芷若", "赵敏");

        //distinct 去重
        //基于hashcode 和equals 如果是自定义封装对象需要重写这两个方法
        list1.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("=======");
        //concat 合并
        //注：最好使用一个类型，如果不一致使用a b共同的父类
        Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s));
    }
}
