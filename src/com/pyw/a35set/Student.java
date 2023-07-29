package com.pyw.a35set;

import java.util.Objects;

public class Student implements Comparable<Student>{
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        //指定排序规则
        //只看年龄，想要按照年龄的升序进行排序
        /*
            this表示当前要添加的元素
            o表示已在红黑树中存在的元素
              o是会变的，一只代表当前比较的元素，直到在红黑树找到自己的位置
            返回值：
                负数：认为要添加的元素是小的，存左边
                正数：认为要添加的元素是大的，存右边
                0：认为添加的元素已存在，舍弃
         */
        System.out.println("====");
        System.out.println("this:"+this.getAge());
        System.out.println("o:"+o.getAge());
        return this.getAge() - o.getAge();
    }
}
