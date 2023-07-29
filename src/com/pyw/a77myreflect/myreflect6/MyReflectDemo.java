package com.pyw.a77myreflect.myreflect6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class MyReflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    /*
        反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
    */
        //1.读取配置文件中的信息
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/com/pyw/a77myreflect/myreflect6/prop.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        String classname = (String) prop.get("classname");
        String methodName = (String) prop.get("method");
        System.out.println(classname);
        System.out.println(methodName);

        //利用反射创建对象并运行方法
        Class clazz = Class.forName(classname);

        //获取构造方法
        Constructor con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();
        System.out.println(o);

        //获取成员方法并运行
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        //运行方法
        method.invoke(o);
    }
}