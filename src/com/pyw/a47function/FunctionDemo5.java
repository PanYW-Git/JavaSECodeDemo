package com.pyw.a47function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo5 {
    public static void main(String[] args) {
        /*
            方法引用(类名引用成员方法)
            语法：
                类名::成员方法

            集合里面添加字符串，变成大写后再输出

            方法引用的规则：
            1.需要又函数式接口
            2.被引用的方法必须已经存在
            3.被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致
            4.被引用的功能需要满足当前的需求

            抽象方法详解：
            第一个参数：表示被引用方法的调用者，决定了可以引用哪些类中的方法
                        再Stream流中，第一个参数一般都表示流里面的每一个数据。
                        架设流里面的数据是字符串，那么这种方式进行方法引用，只能引用String这个类中的方法

            局限性：
            不能引用所有类中的成员方法。
            是跟抽象方法的第一个参数有关，这个参数是什么类型的，那么就只能引用这个类中的方法。
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc");

        //匿名内部类
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);

        list.stream()
                //拿着流里面的每一个数据，去调用String类中的toUpperCase方法，方法的返回值就是转换之后的结果。
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
