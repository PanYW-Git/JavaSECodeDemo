package com.pyw.a11extendsdemo.ExtendsTest1;

public class Teacher extends Employee{
    private String work;

    public Teacher() {
        this(null,null,"教学");
    }

    public Teacher(String id,String name,String work) {
        super(id,name,work);
        this.work = work;
    }

    public Teacher(String work) {
        this.work = work;
    }

    public void doWork(){
        System.out.println("正在做教学工作");
    }


    /**
     * 获取
     * @return work
     */
    public String getWork() {
        return work;
    }

    /**
     * 设置
     * @param work
     */
    public void setWork(String work) {
        this.work = work;
    }


    public String toString() {
        return "Teacher{work = " + work + "}";
    }
}
