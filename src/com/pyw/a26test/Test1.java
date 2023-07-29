package com.pyw.a26test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //存储一些女朋友对象，利用Arrays的sort方法排序
        //要求1：属性有姓名、年龄、身高
        //要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。(姓名中不要有中文或特殊字符，会涉及到后面的知识)
        GrilFriend[] grilFriends = {
                new GrilFriend("yzy",18,160),
                new GrilFriend("yzy123",22,160),
                new GrilFriend("yzy12323",18,161),
                new GrilFriend("yzy1",18,159),
                new GrilFriend("yzy12",22,160)
        };
        //完整格式
        Arrays.sort(grilFriends,(GrilFriend g1,GrilFriend g2)->{
            double result = g1.getAge() - g2.getAge();

            result = (result == 0 ? g1.getHeigh() - g2.getHeigh() : result);

            result = (result == 0 ? g1.getName().length() - g2.getName().length() : result);

            if(result>0){
                return 1;
            }else if(result<0){
                return -1;
            }else {
                return 0;
            }
        });
        //简化
        Arrays.sort(grilFriends,(g1,g2)->{
            double result = g1.getAge() - g2.getAge();
            result = (result == 0 ? g1.getHeigh() - g2.getHeigh() : result);
            result = (result == 0 ? g1.getName().length() - g2.getName().length() : result);
            if(result>0){
                return 1;
            }else if(result<0){
                return -1;
            }else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(grilFriends));
    }
}

class GrilFriend{
    private String name;
    private int age;
    private double heigh;


    public GrilFriend() {
    }

    public GrilFriend(String name, int age, double heigh) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
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
        this.age = age;
    }

    /**
     * 获取
     * @return heigh
     */
    public double getHeigh() {
        return heigh;
    }

    /**
     * 设置
     * @param heigh
     */
    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public String toString() {
        return "GrilFriend{name = " + name + ", age = " + age + ", heigh = " + heigh + "}";
    }
}