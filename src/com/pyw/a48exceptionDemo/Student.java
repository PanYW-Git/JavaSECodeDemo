package com.pyw.a48exceptionDemo;

public class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if(age < 18 || age > 40){
            //System.out.println("年龄超出范围");
            throw new RuntimeException();
        }else{
            this.age = age;
        }
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
