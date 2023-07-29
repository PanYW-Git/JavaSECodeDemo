package com.pyw.a77myreflect.myreflect5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        /*
            对任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
         */

        Student s = new Student("张三",23,'女',167.5,"睡觉");
        Teacher t = new Teacher("阿伟",10000);

        saveObject(t);
    }

    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        //1.获取字节码文件的对象
        Class clazz = obj.getClass();

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/pyw/a77myreflect/myreflect5/a.txt"));

        //2.获取所有的成员变量
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            //获取成员变量的名字
            String name = declaredField.getName();
            //成员变量的值
            Object value = declaredField.get(obj);
            System.out.println(name+"="+value);
            bw.write(name+"="+value);
            bw.newLine();
        }
        bw.close();
    }
}
