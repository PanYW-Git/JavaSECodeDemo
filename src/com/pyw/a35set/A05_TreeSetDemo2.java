package com.pyw.a35set;


import java.util.TreeSet;

public class A05_TreeSetDemo2 {
    public static void main(String[] args) {
        /*


            需求：创建TreeSet集合，并添加3个学生对象
            学生对象属性：
                姓名，年龄。
                要求按照学生的年龄进行排序
                同年龄按照姓名字母排列（暂不考虑中文）
                同姓名，同年龄认为是同一个人

            方式一：
                默认的排序规则/自然排序
                Student实现Comparable接口，重写里面的抽象方法，再指定比较规则
        */


        //1.创建三个学生对象
        Student s2 = new Student("lisi",24);
        Student s1 = new Student("zhangsan",23);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhaoliu",26);


        //2.创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        /*
            排序规则：
                如果是字符、字符串类型，按照ASCII码表中的升序进行排序

            注：如果使用TreeSet集合存储对象，需要实现Comparabl接口，
            不然就是没有排序规则添加时会报错
         */
        //3.添加元素
        ts.add(s3);
        ts.add(s2);
        ts.add(s1);
        ts.add(s4);

        //4.打印集合
        System.out.println(ts);

        //HashCode和equals方法和哈希表有关
        //TreeSet 底层是红黑树不需要重写HashCode和equals

    }
}