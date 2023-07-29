package com.pyw.a08oop;

public class ConstructorMethodDemo1 {
    //TODO 构造方法定义 修饰符+类名
    //构造方法概述：创建对象的时候，虚拟机会自动调用构造方法，作用是给成员变量进行初始化

    private String name;

    private int age;

    //构造代码块
    // 1.卸载成员位置的代码块
    // 2.在构造方法之前执行
    // 3。作用：可以把多个构造方法中重复的代码抽取出来
    // 已经不咋用了，可以用方法的形式替代
    {
        System.out.println("这是构造代码块");
    }

    // 静态代码块
    // 只执行一次，随着类的加载而加载，并且自动触发，只执行一次
    // 作用： 在类加载的时候，做一些数据初始化使用
    static {
        System.out.println("静态代码块执行了");
    }

    public ConstructorMethodDemo1(){
        System.out.println("进入构造方法");
    }

    public ConstructorMethodDemo1(String name,int age){
        this.name = name;
        this.age = age;
    }


    public void setAge(int age) {
        //set方法中可以对数据健壮性处理
        if(age >=0 && age<=200){
            this.age = age;
        }else {
            System.out.println("非法参数");
        }
    }
    public void setName(String name) {
        //局部变量 在方法中定义的属性

        //this表示成员变量
        this.name = name;//变量采取就近原则，离局部变量进就得到局部变量，如果要使用成员变量使用关键字this.成员变量
    }

    public String getName() {

        return name;
    }

    public int getAge() {


        return age;
    }


}
