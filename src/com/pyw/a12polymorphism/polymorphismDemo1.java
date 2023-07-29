package com.pyw.a12polymorphism;

public class polymorphismDemo1 {

    public static void main(String[] args) {
        //TODO 多态Demo
        Animal a = new Dog();
        //对于成员属性，编译看左边，运行也看左边
        System.out.println(a.name);
        //对于成员方法，编译看左边，运行看右边
        a.eat();

        //多态的弊端：
        //不能调用子类的特有功能
        //a.lookHome();

        //解决方案
        //强制转换为子类
        Dog d = (Dog) a;
        d.lookHome();

        //如何判断是不是子类？
        //instanceof 关键字
        //语法： 变量名 instanceof 类名

        System.out.println("=================================");
        Animal a1 = new Dog();
        //Animal a1 = new Cat();
        //Animal a1 = new Dog();

        if(a1 instanceof Dog){
            Dog d1 = (Dog) a1;
            d1.lookHome();
        }else if(a1 instanceof Cat){
            Cat c1 = (Cat) a1;
            c1.play();
        }else {
            System.out.println("没有这个类型 无法转换");
        }

        //jdk14以后版本新特性
        //先判断a是否为Dog类型，如果是，则墙砖为Dog类型，转换后类型为d
        //如果不是，则步枪转，结果直接是false
        System.out.println("==================================");
        if(a1 instanceof Dog d2){
            d2.lookHome();
        }else if(a1 instanceof Cat c2){
            c2.play();
        }else {
            System.out.println("没有这个类型 无法转换");
        }

    }
}

class Animal{
    String name = "动物";
    public void eat(){
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal{
    String name = "狗";
    public void eat(){
        System.out.println("狗在啃骨头");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}

class Cat extends  Animal{
    String name = "猫";
    public void eat(){
        System.out.println("猫在吃鱼");
    }

    public void play(){
        System.out.println("猫在玩");
    }
}