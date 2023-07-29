package com.pyw.a82annotation.annotationdemo3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("====通过反射获取类注解中的值====");
        parseClass();
        System.out.println("====通过反射获取方法注解中的值====");
        parseMethod();
    }

    public static void parseClass(){
        //1.先得到class对象
        Class clazz = AnootationClassDemo3.class;

        //2.解析类上的注解
        //判断类上是否包含了某个注解
        if(clazz.isAnnotationPresent(AnootationDemo3.class)){
            AnootationDemo3 anootationDemo3 = (AnootationDemo3) clazz.getDeclaredAnnotation(AnootationDemo3.class);
            System.out.println(anootationDemo3.value());
            System.out.println(anootationDemo3.aaa());
            System.out.println(Arrays.toString(anootationDemo3.bbb()));
        }
    }

    public static void parseMethod() throws NoSuchMethodException {
        //1.先得到class对象
        Class clazz = AnootationClassDemo3.class;

        Method method = clazz.getDeclaredMethod("test1");

        //2.解析类上的注解
        //判断类上是否包含了某个注解
        if(method.isAnnotationPresent(AnootationDemo3.class)){
            AnootationDemo3 anootationDemo3 = (AnootationDemo3) method.getDeclaredAnnotation(AnootationDemo3.class);
            System.out.println(anootationDemo3.value());
            System.out.println(anootationDemo3.aaa());
            System.out.println(Arrays.toString(anootationDemo3.bbb()));
        }
    }
}
