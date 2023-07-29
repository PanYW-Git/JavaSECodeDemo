package com.pyw.a08oop;

public class OOPDemo1 {

    //TODO 类属性的获取使用get set方法 ，可以在方法中处理这个对象的值

    //类中的变量叫成员变量


    private String name;

    private int age;



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
