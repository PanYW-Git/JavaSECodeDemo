package com.pyw.a77myreflect.myreflect3;

import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
     /*
       Class类中用于获取成员变量的方法
            Field[] getFields()：                返回所有公共成员变量对象的数组
            Field[] getDeclaredFields()：        返回所有成员变量对象的数组
            Field getField(String name)：        返回单个公共成员变量对象
            Field getDeclaredField(String name)：返回单个成员变量对象

       Field类中用于创建对象的方法
            void set(Object obj, Object value)：赋值
            Object get(Object obj)              获取值

    */

        //1.获取class字节码文件
        Class<?> clazz = Class.forName("com.pyw.a77myreflect.myreflect3.Student");

        //2.获取成员变量
        //只获取Public的
        Field[] fields1 = clazz.getFields();
        for (Field field : fields1) {
            System.out.println(field);
        }

        //获取所有的成员变量（包括私有）
        System.out.println("===================================");
        Field[] fields2 = clazz.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }

        //获取单个的成员变量
        Field gender = clazz.getField("gender");
        System.out.println(gender);

        //获取单个的私有的成员变量
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        System.out.println("==============");
        //获取权限修饰符
        int modifiers = name.getModifiers();
        System.out.println(modifiers);

        //获取成员变量名
        String n = name.getName();
        System.out.println(n);

        //获取成员变量类型
        Class<?> type = name.getType();
        System.out.println(type);

        //获取尘缘变量记录的值
        Student student = new Student("zhangsan",23,"男");
        //name是私有的，需要临时取消权限规则
        name.setAccessible(true);
        String value = (String) name.get(student);
        System.out.println(value);

        //修改对象里面记录的值
        //参数一：哪个对象里面的值要修改？ 参数二：修改成什么？
        name.set(student,"lisi");
        System.out.println(student);
    }
}
