package com.pyw.a11extendsdemo.ExtendsTest1;

public class AdminStaff extends Employee{
    private String work;


    public AdminStaff() {
        this("行政管理");
    }

    public AdminStaff(String work) {
        this.work = work;
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
        return "AdminStaff{work = " + work + "}";
    }
}
