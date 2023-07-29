package com.pyw.a77myreflect.myreflect1;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        /*
            获取class对象的三种方式
                1.Class.forName("全类名") 如：com.pyw.a77myreflect.a77myreflect1.Student
                2.类名.class
                3.对象.getClass();
         */

        //1.第一种方式
        //全类名：包名+类名
        //最为常用
        Class clazz = Class.forName("com.pyw.a77myreflect.myreflect1.Student");

        //打印结果
        System.out.println(clazz);

        //2.第二种方式
        //一般更多是当作参数进行传递
        Class clazz2 = Student.class;
        System.out.println(clazz2);
        
        //3.第三种方式
        //当我们已经有了这个类的对象时，才可以使用
        Student student= new Student();
        Class clazz3 = student.getClass();
        System.out.println(clazz3);

        System.out.println(clazz == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
