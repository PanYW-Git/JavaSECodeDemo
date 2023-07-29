package com.pyw.a29collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        //1.创建集合的对象
        Collection<Student> coll = new ArrayList<>();


        //2.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);


        //3.把学生对象添加到集合当中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4.判断集合中某一个学生对象是否包含
        Student s4 = new Student("zhangsan",23);
        //因为contains方法在底层依赖equals方法判断对象是否一致的。
        //如果存的是自定义对象，没有重写equals方法，那么默认使用Object类中的equals方法进行判断，而Object类中equals方法，依赖地址值进行判断。
        //需求：如果同姓名和同年龄，就认为是同一个学生。
        //所以，需要在自定义的Javabean类中，重写equals方法就可以了。
        System.out.println(coll.contains(s4));


    }
}


class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    //alt+insert快速生成 equals方法
    @Override
    public boolean equals(Object o) {
        //地址值相等直接返回true
        if (this == o) return true;
        //o为null或者 getClass不等于o直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        //判断
        return age == student.age && Objects.equals(name, student.name);
    }



    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
