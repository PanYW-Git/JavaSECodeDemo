package com.pyw.a15innerclass;

public class InnerClassDemo1 {
    public static void main(String[] args) {
        /*
            内部类的访问特点：
                内部类可以直接访问外部类成员，包括私有
                外部类要访问内部类，必须创建对象
         */


        /*
            匿名内部类

         */

        method(new Car1(){
            @Override
            public void show() {
                System.out.println("我是匿名内部类重写的方法");
            }
        });
    }

    public static void method(Car1 c){
        c.show();
    }
}
