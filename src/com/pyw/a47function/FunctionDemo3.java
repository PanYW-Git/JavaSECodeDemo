package com.pyw.a47function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDemo3 {
    public static void main(String[] args) {
        /*
        TODO 方法引用（引用成员方法）
        格式
         *       静态   类名：：方法名
         *       成员方法 在哪儿？
         *              如果流里面时Student类型，并且方法再Student方法当中 类名::方法名
         *              如果方法在其他类 对象名::方法名
         *              如果方法在本类   this::方法名
         *              如果方法在父类   super::方法名
         *       构造方法  类名：：new
        需求：
            集合中有一些名字，按照要求过滤数据
            数据："张无忌","周芷若","赵敏","张强","张三丰"
            要求：只要以张开头，而且名字是3个字的
       */

        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        //3.过滤数据（只要张开头的数据而且名字是3个字的）
        //lambda
        list.stream()
                .filter(s->s.startsWith("张"))
                .filter(s->s.length() == 3)
                .forEach(s -> System.out.println(s));
        //匿名内部类
        list.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("张") && s.length() ==3;
                    }
                })
                .forEach(s -> System.out.println(s));
        //方法引用（引用成员方法）
        StringOperation so = new StringOperation();
        list.stream()
                .filter(so::stringJudege)
                .forEach(s -> System.out.println(s));
        //方法引用（本类成员方法）
        //静态方法中是没有this的
        list.stream().filter(new FunctionDemo3()::stringJudege)
                .forEach(s-> System.out.println(s));

    }

    public void test(ArrayList<String> list){
        //方法引用（本类成员方法）
        list.stream()
                .filter(this::stringJudege)
                .forEach(s -> System.out.println(s));
    }

    public boolean stringJudege(String s){
        return s.startsWith("张") && s.length() ==3;
    }
}
