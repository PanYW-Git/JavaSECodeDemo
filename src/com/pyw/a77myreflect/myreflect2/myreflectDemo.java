package com.pyw.a77myreflect.myreflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class myreflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    /*
        Class类中用于获取构造方法的方法
            Constructor<?>[] getConstructors()                                返回所有公共构造方法对象的数组
            Constructor<?>[] getDeclaredConstructors()                        返回所有构造方法对象的数组
            Constructor<T> getConstructor(Class<?>... parameterTypes)         返回单个公共构造方法对象
            Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回单个构造方法对象


        Constructor类中用于创建对象的方法
            T newInstance(Object... initargs)                                 根据指定的构造方法创建对象
            setAccessible(boolean flag)                                       设置为true,表示取消访问检查
    */

        //1.获取class字节码文件对象
        System.out.println("你好");
        Class clazz = Class.forName("com.pyw.a77myreflect.myreflect2.Student");

        //2.获取构造方法
        System.out.println("=======================");
        //只能获取public修饰的
        Constructor[] cons1 = clazz.getConstructors();
        for (Constructor con : cons1) {
            System.out.println(con);
        }

        //获取所有的构造方法 包括私有的
        //获取所有的
        System.out.println("==========================");
        Constructor[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor con : cons2) {
            System.out.println(con);
        }


        //获取单个构造方法
        System.out.println("==========================");
        //需要获取哪个构造，就对应参数对应类型的形参
        Constructor con1 = clazz.getDeclaredConstructor();
        System.out.println(con1);

        Constructor con2 = clazz.getDeclaredConstructor(String.class);
        System.out.println(con2);

        Constructor con3 = clazz.getDeclaredConstructor(String.class,Integer.class);
        //获取权限修饰符
        //public 返回1
        //private 返回2
        int modifiers = con3.getModifiers();
        System.out.println(con3);
        System.out.println(modifiers);

        //获取每一个参数的类型
        Parameter[] parameters = con3.getParameters();
        for(Parameter parameter : parameters){
            System.out.println(parameter);
        }

        //暴力反射：构造方法时private，这个方法的作用是临时取消权限的校验
        con3.setAccessible(true);
        Student student = (Student) con3.newInstance("张三", 24);
        System.out.println(student);
    }
}
