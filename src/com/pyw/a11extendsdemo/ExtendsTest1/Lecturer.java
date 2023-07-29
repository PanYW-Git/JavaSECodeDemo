package com.pyw.a11extendsdemo.ExtendsTest1;

public class Lecturer extends Teacher{

    public Lecturer() {
    }

    public Lecturer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void doWork() {
        System.out.println("正在教学学生");
    }


    public String toString() {
        return "Lecturer{" +
                "id" + super.getId() +
                "name" + super.getName() +
                "work" + super.getWork() +
                "}";
    }
}
