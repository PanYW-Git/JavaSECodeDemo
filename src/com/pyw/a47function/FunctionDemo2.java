package com.pyw.a47function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        /*
            方法引用（引用静态方法）
            格式
                类::方法名
            需求：
                集合中又一下数字，要求把他们都变成int类型
                "1","2","3","4","5"
         */

        //1.创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");

        //2.把他们都变成int类型
        //匿名内部类
        list.stream().map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s -> System.out.println(s));

        //方法引用
        //方法引用
        //1、引用除必须是函数式接口
        //2、被引用的方法需要已存在（可以是java写好的，也可以是第三方的工具类）
        //3、被引用的形参和返回值需要跟抽象方法的形参喝返回值保持一致
        //4、被引用的方法的功能需要满足当前的要求
        System.out.println("====方法引用====");
        list.stream()
                .map(Integer::parseInt)
                .forEach(s -> System.out.println(s));
    }
}
