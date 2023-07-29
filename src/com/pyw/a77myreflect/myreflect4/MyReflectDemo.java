package com.pyw.a77myreflect.myreflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    /*
       Class类中用于获取成员方法的方法
            Method[] getMethods()：返回所有公共成员方法对象的数组，包括继承的
            Method[] getDeclaredMethods()：返回所有成员方法对象的数组，不包括继承的
            Method getMethod(String name, Class<?>... parameterTypes) ：返回单个公共成员方法对象
            Method getDeclaredMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象


       Method类中用于创建对象的方法
            Object invoke(Object obj, Object... args)：运行方法
            参数一：用obj对象调用该方法
            参数二：调用方法的传递的参数（如果没有就不写）
            返回值：方法的返回值（如果没有就不写）

        获取方法的修饰符
        获取方法的名字
        获取方法的形参
        获取方法的返回值
        获取方法的抛出的异常

    */


        //1.获取class字节码文件的对象
        Class<?> clazz = Class.forName("com.pyw.a77myreflect.myreflect4.Student");

        //2.获取里面所有的方法对象，也包含父类中的所有公共方法(公共方法)
        System.out.println("====================获取里面所有的方法对象，也包含父类中的所有公共方法(公共方法)===========================");

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        
        //获取里面的所有方法对象，不包含父类中的方法（所有方法）
        System.out.println("====================获取里面的所有方法对象，不包含父类中的方法（所有方法）===========================");
        Method[] methods2 = clazz.getDeclaredMethods();
        for (Method method : methods2) {
            System.out.println(method);
        }

        //获取单个方法
        //参数一：方法的名字 参数二：方法的形参（可能又重载的情况）
        System.out.println("========获取单个方法=======");
        Method method = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(method);

        //获取方法的修饰符
        System.out.println("========获取方法的修饰符=======");
        int modifiers = method.getModifiers();
        System.out.println(modifiers);

        //获取方法的名字
        System.out.println("========获取方法的名字=======");
        String name = method.getName();
        System.out.println(name);

        //获取方法的形参
        System.out.println("========获取方法的形参=======");
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //获取方法抛出的异常
        System.out.println("========获取方法抛出的异常=======");
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        //方法运行
        System.out.println("====获取方法再运行========");
        /*
            Method类中用于创建对象的方法
            Object invoke(Object obj, Object... args)：运行方法
            参数一：用obj对象调用该方法
            参数二：调用方法的传递的参数（如果没有就不写）
            返回值：方法的返回值（如果没有就不写）
         */
        Student s = new Student();
        method.setAccessible(true);
        //参数一：s： 表示方法的调用者
        //参数二："火锅"：表示方法运行的实际参数
        String result = (String) method.invoke(s, "火锅");
        System.out.println(result);
    }
}
