package com.pyw.a08oop;

public class ConstructorMethodDemo1Start {
    public static void main(String[] args) {
        //如果创建的对象中有构造方法了，那么java不会自动创建无参构造方法，如果需要使用无参构造方法需要在类中添加
        //如果要写有参的构造方法，在开发时都要写上空参和无参的构造方法！！！
        ConstructorMethodDemo1 constructorMethodDemo1 = new ConstructorMethodDemo1("张三",18);
        System.out.println(constructorMethodDemo1.getName());

        //静态代码块只执行一次
        ConstructorMethodDemo1 constructorMethodDemo2 = new ConstructorMethodDemo1("李四",19);

    }
}
