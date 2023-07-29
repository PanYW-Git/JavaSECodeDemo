package com.pyw.a35set;

import java.util.HashSet;

public class A03_HashSetDemo2 {
    public static void main(String[] args) {
        /* 需求：创建一个存储学生对象的集合，存储多个学生对象。
            使用程序实现在控制台遍历该集合。
            要求：学生对象的成员变量值相同，我们就认为是同一个对象


        String   Integer
*/
        //1.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);
        Student s5 = new Student("zhangsan",23);

        //2.创建集合用来添加学生
        HashSet<Student> hs = new HashSet<>();

        //3.添加元素
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));
        System.out.println(hs.add(s5));
        /*
            这个时候是没有去重的，因为hashcode默认是按照地址值进行计算的
            如果需要去重，则需要重写hashcode方法和equals方法

            但是像Integer String这种方法是已经写好了的，就不用重写了
         */
        //4.打印
        System.out.println(hs);



    }
}
