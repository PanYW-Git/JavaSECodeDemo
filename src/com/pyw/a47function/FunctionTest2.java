package com.pyw.a47function;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionTest2 {
    public static void main(String[] args) {
        /*
         *   需求：
         *       创建集合添加学生对象
         *       学生对象属性：name，age
         *   要求：
         *       获取姓名并放到数组当中
         *       使用方法引用完成
         *
         *   技巧：
         *       1.现在有没有一个方法符合我当前的需求
         *       2.如果有这样的方法，这个方法是否满足引用的规则
         *       静态   类名：：方法名
         *       成员方法 在哪儿？
         *              如果流里面时Student类型，并且方法再Student方法当中 类名::方法名
         *              如果方法在其他类 对象名::方法名
         *              如果方法在本类   this::方法名
         *              如果方法在父类   super::方法名
         *       构造方法  类名：：new
         *
         *
         * */

        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //2.添加元素
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu",25));

        String[] strings = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
    }
}
