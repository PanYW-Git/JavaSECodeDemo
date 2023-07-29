package com.pyw.a82annotation.annotationtest1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    需求：模拟Junit框架的设计
 */
public class Test {
//    @MyTest
    public void test1(){
        System.out.println("============test1============");
    }

    @MyTest
    public void test2(){
        System.out.println("============test2============");
    }

//    @MyTest
    public void test3(){
        System.out.println("============test3============");
    }

    @MyTest
    public void test4(){
        System.out.println("============test4============");
    }

    //模拟Test启动程序
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //1.得到class对象
        Class clazz = Test.class;

        //提取全部成员方法
        Method[] methods = clazz.getMethods();
        //遍历数组中的每个方法，方法上是否存在@MyTest注解
        //存在：触发执行方法
        for (Method method : methods) {
            //是否存在@MyTest注解
            if(method.isAnnotationPresent(MyTest.class)){
                //存在：触发执行方法
                method.invoke(new Test());
            }
        }
    }
}
