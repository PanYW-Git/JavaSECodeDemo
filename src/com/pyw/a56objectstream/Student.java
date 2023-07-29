package com.pyw.a56objectstream;

import java.io.Serial;
import java.io.Serializable;

/*
    Serializable接口没有抽象方法，标记型接口
    一但实现了这个接口，表示当前的student类可以被序列化
    理解：
        一个物品的合格证
 */
public class Student implements Serializable {

    /*
        序列化ID，如果javabean被序列化了，
        但是内容变更了（变更时会重新生成序列化id），这个时候再反序列化会报错
        所以需要把序列化ID固定下来

        设置自动提示：再setting中搜索Serializable
        勾选1：Serializable class without 'serialVersionUID'
        勾选2：Transient field is not initialized on deserialization
     */
    @Serial
    private static final long serialVersionUID = -1714107042296737404L;

    private String name;
    private int age;
    //transient:瞬态关键字：
    //作用：不会吧当前属性序列化到本地文件中
    private transient String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
