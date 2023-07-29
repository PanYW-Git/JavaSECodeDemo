package com.pyw.a37hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A01_HashMapDemo1 {
    public static void main(String[] args) {
       /*
        需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
        存储三个键值对元素，并遍历
        要求：同姓名，同年龄认为是同一个学生（键唯一）

        核心点：
            HashMap的键位置如果存储的是自定义对象，需要重写hashCode和equals方法。
            如果是值，则不需要重写hashcode和equals方法
       */


        //1.创建HashMap的对象
        HashMap<Student,String> stuMap = new HashMap<>();

        //2.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("wangwu",25);

        //3.添加元素
        stuMap.put(s1,"重庆");
        stuMap.put(s2,"四川");
        stuMap.put(s3,"北京");
        stuMap.put(s4,"山东");
        //4.遍历集合
        System.out.println("====lambda表达式====");
        stuMap.forEach(((student, s) -> System.out.println(student+"--->"+s)));

        System.out.println("====entrySet遍历===");
        Set<Map.Entry<Student, String>> entries = stuMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"--->"+value);
        }

        System.out.println("增强for遍历");
        Set<Student> students = stuMap.keySet();
        for (Student student : students) {
            String value = stuMap.get(student);
            System.out.println(student+"--->"+value);
        }

    }
}
