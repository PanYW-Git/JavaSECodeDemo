package com.pyw.a08oop;

public class JavaBeanDemo1 {
    //TODO 标准javabean定义

    //快捷键 alt+insert Constructor 生成构造方法 geter and seter 生成getset方法
    //ptg插件 右键选择 ptg to 自动生成javabean 且带注释 这个好用！！！

    private String name;
    private int age;
    private String sex;
    private String remark;




    public JavaBeanDemo1() {
    }

    public JavaBeanDemo1(String name, int age, String sex, String remark) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.remark = remark;
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
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String toString() {
        return "JavaBeanDemo1{name = " + name + ", age = " + age + ", sex = " + sex + ", remark = " + remark + "}";
    }
}
