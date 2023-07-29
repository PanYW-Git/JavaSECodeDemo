package com.pyw.a48exceptionDemo;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        /*
            异常作用一：异常是用来查询bug的关键参考信息
            异常作用二：异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
        */


        //1.创建学生对象
        Student s1 = new Student();
        //年龄：（同学） 18~40岁
        s1.setAge(50);//就知道了50赋值失败
                    //选择1：自己悄悄处理
                    //选择2：打印在控制台上



    }
}
