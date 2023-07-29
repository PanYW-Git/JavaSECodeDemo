package com.pyw.a11extendsdemo.ExtendsTest1;

public class Employee {
    private String id;

    private String name;

    private String work;

    public Employee() {
    }

    public Employee(String id, String name, String work) {
        this.id = id;
        this.name = name;
        this.work = work;
    }

    public void doWork(){
        System.out.println("员工正在工作");
    }


    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
        return "Employee{id = " + id + ", name = " + name + ", work = " + work + "}";
    }
}
